package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Arrange;
import com.trkj.tsm.entity.Detailcourse;
import com.trkj.tsm.entity.Earrange;
import com.trkj.tsm.service.ArrangeService;
import com.trkj.tsm.service.DetailcourseService;
import com.trkj.tsm.service.EarrangeService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.CourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Random;

@RestController
@Slf4j
public class ArrangeController {
    @Autowired
    private ArrangeService arrangeService;
    @Autowired
    private EarrangeService earrangeService;
    @Autowired
    private DetailcourseService detailcourseService;

    @PostMapping("/insertArrange")
    public AjaxResponse insertArrange(@RequestBody @Valid int CC){
        log.debug("ArrangeService:添加排课-------------------------------------");
        List<Earrange> earrangeList1=earrangeService.selectAllEarrangeGroupByeClasses_Id();
        List<Earrange> earrangeList2=earrangeService.selectAllEarrangeGroupBys();
        List<Earrange> earrangeList3=earrangeService.selectAllEarrangeGroupByeClassRoom_Id();

        for(int i=0;i<earrangeList1.size();i++){
            for(int i1=0;i1<CC;i1++){
                Random random=new Random();
                int index=random.nextInt(earrangeList2.size());//产生的随机数必须是数组的索引值范围值

                Random random1=new Random();
                int index1=random1.nextInt(earrangeList3.size());

                Detailcourse detailcourse=detailcourseService.selectById(
                        earrangeList1.get(i).getClasses().getDetailcourseId()
                );
                List<Detailcourse> detailcourseList=detailcourseService.selectBypp(
                        earrangeList1.get(i).getClasses().getCourseId(),detailcourse.getSerial()
                );

                Arrange arrange=new Arrange();
                arrange.setClassesId(earrangeList1.get(i).getEclassesId());
                arrange.setPeriodId(earrangeList2.get(index).getEperiodId());
                arrange.setClassroomId(earrangeList3.get(index1).getEclassroomId());
                arrange.setArrangedate(earrangeList2.get(index).getEarrangedate());
                arrange.setTeacherId(earrangeList1.get(i).getClasses().getTeacherId());
                if(detailcourseList.size()==0||detailcourseList.get(0).getDetailcourseId()==0){
                    arrange.setDetailcourseId(0);
                }else{
                    arrange.setDetailcourseId(detailcourseList.get(i1).getDetailcourseId());
                }

                Arrange arrangeinsert=arrangeService.insertArrange(arrange);

                earrangeList2.remove(index);
            }
        }

        return AjaxResponse.success(666);
    }


    @GetMapping("/selectAllArrange")
    public PageInfo<Arrange> selectAllArrange(@RequestParam("currentPage") int currentPage,
                                          @RequestParam("pagesize") int pagesize,
                                          @RequestParam("sech") String likeke){
        log.debug("ArrangeService:查找排课-------------------------------------");
        String likekes="%"+likeke+"%";
        PageHelper.startPage(currentPage,pagesize);
        List<Arrange> entityPage =arrangeService.selectAllArrange(likekes);
        PageInfo<Arrange> arrangePageInfo = new  PageInfo<>(entityPage);
        return arrangePageInfo;
    }

    @DeleteMapping("/deleteAllArrange")
    public AjaxResponse deleteAllArrange(){
        Arrange arrange=arrangeService.deleteAllArrange();
        Earrange earrange=earrangeService.deleteAllEarrange();
        return AjaxResponse.success("课表清除成功！");
    }

}
