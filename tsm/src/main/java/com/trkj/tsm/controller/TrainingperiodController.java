package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Trainingperiod;
import com.trkj.tsm.service.TrainingperiodService;
import com.trkj.tsm.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class TrainingperiodController {
    @Autowired
    private TrainingperiodService trainingperiodService;

    @GetMapping("/selectTrainingperiodLike")
    public PageInfo<Trainingperiod> selectTrainingperiodLike(@RequestParam("currentPage") int currentPage,
                                                         @RequestParam("pagesize") int pagesize,
                                                         @RequestParam("sech") String likeke){
        log.debug("TrainingperiodController:模糊查询时段-----------------------------------------");
        String likekes="%"+likeke+"%";
        PageHelper.startPage(currentPage,pagesize);
        List<Trainingperiod> entityPage =trainingperiodService.selectTrainingperiodLike(likekes);
        PageInfo<Trainingperiod> rainingperiodVoPageInfo = new  PageInfo<>(entityPage);
        return rainingperiodVoPageInfo;
    }

    @GetMapping("/selectTrainingperiod")
    public List<Trainingperiod> selectTrainingperiod(){
        log.debug("TrainingperiodController:根据时段找时段-----------------------------------------");
        List<Trainingperiod> entityPage =trainingperiodService.selectTrainingperiod();
        return entityPage;
    }

    @PutMapping("/deleteTrainingperiod")
    public AjaxResponse deleteTrainingperiod(@RequestBody @Valid Trainingperiod trainingperiod){
        trainingperiod.setDeletetime(new Date());
        log.debug("删除学员---------------------------------------------------");
        trainingperiodService.deleteTrainingperiod(trainingperiod.getPeriodId());
        return AjaxResponse.success(trainingperiod);
    }
    @PutMapping("/updateTrainingperiod")
    public AjaxResponse updateTrainingperiod(@RequestBody @Valid Trainingperiod trainingperiod){
        trainingperiod.setDeletetime(new Date());
        log.debug("修改时段---------------------------------------------------");
        trainingperiodService.updateTrainingperiod(trainingperiod);
        return AjaxResponse.success(trainingperiod);
    }
    @PostMapping("/insertTrainingperiod")
    public AjaxResponse insertTrainingperiod(@RequestBody @Valid Trainingperiod trainingperiod){
        trainingperiod.setDeletetime(new Date());
        log.debug("添加时段---------------------------------------------------");
        trainingperiodService.insertTrainingperiod(trainingperiod);
        return AjaxResponse.success(trainingperiod);
    }
}
