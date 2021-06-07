package com.trkj.tsm.controller;

import com.trkj.tsm.service.DetailcourseService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.DetailcourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class DetailcourseController {
    @Autowired
    private DetailcourseService detailcourseService;

    @GetMapping("/selectDetailCourse/{courseid}")
    public List<DetailcourseVo> selectfind(@PathVariable("courseid") int courseid){
        log.debug("查询信息");
        log.debug("---------------------------------------------------");
        List<DetailcourseVo> entityPage =detailcourseService.selectByCourseId(courseid);

        return entityPage;
    }

    @PutMapping("/updDetailcourseTimeless")
    public AjaxResponse updDetailcourseTimeless(@RequestBody @Valid DetailcourseVo detailcourseVo){
        detailcourseVo.setDeletetime(new Date());
        log.debug("课时删除");
        detailcourseService.updDetailcourseTimeless(detailcourseVo);
        return AjaxResponse.success(detailcourseVo);
    }

    @PutMapping("/updDetailcourse")
    public AjaxResponse updDetailcourse(@RequestBody @Valid DetailcourseVo detailcourseVo){
        detailcourseVo.setUpdatetime(new Date());
        log.debug("课程修改");
        detailcourseService.updDetailcourse(detailcourseVo);
        return AjaxResponse.success(detailcourseVo);
    }

    @PostMapping("/insertDetailcourse")
    public AjaxResponse insertDetailcourse(@RequestBody @Valid DetailcourseVo detailcoursevo){
        log.debug(detailcoursevo.toString()+"=================");
        log.debug("新增课时");
        detailcourseService.insertDetailcourse(detailcoursevo);
        return AjaxResponse.success(detailcoursevo);
    }
}
