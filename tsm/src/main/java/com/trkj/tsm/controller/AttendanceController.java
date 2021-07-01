package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.AttendanceService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.AttendanceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/selectAllsAttend")
    public PageInfo<AttendanceVo> selectAllsAttend(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam("flag") String flag){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("--------------------");
        List<AttendanceVo> entityPage=attendanceService.selectAllsAttend(flag);
        PageInfo<AttendanceVo> BookVoPageInfo=new PageInfo<>(entityPage);
        return  BookVoPageInfo;
    }

    @PostMapping("/insertsddsas")
    public AjaxResponse insertsddsas(@RequestBody @Valid AttendanceVo attendanceVo) {

        log.debug(attendanceVo.toString()+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
        attendanceService.insertsddsas(attendanceVo);

        return AjaxResponse.success(attendanceVo);
    }

    @PutMapping("/updateAttendanTimeliness")
    public AjaxResponse updateAttendanTimeliness(@RequestBody @Valid AttendanceVo attendanceVo){
        attendanceVo.setDeletetime(new Date());
        log.debug("删除");
        attendanceService.updateAttendanTimeliness(attendanceVo);
        return AjaxResponse.success(attendanceVo);
    }



    @PutMapping("/updateByPrimaryKeySelectivegwesd")
    public AjaxResponse updateByPrimaryKeySelectivegwesd(@RequestBody @Valid AttendanceVo attendanceVo) {
        log.debug("修改企业档案信息");
        attendanceVo.setUpdatetime(new Date());
        //获取当前时间
        attendanceService.updateByPrimaryKeySelectivegwesd(attendanceVo);
        return AjaxResponse.success(attendanceVo);
    }

    //高级查询
    @GetMapping("cdcsdvdtfdfeg")
    public PageInfo<AttendanceVo> cdcsdvdtfdfeg(@RequestParam("currentPage") int currentPage,
                                            @RequestParam("pagesize") int pagesize,
                                            @RequestParam(value ="Starttime",required = false) String Starttime,
                                            @RequestParam(value ="Endtime",required = false) String Endtime){
        List<AttendanceVo> entityPage =attendanceService.cdcsdvdtfdfeg(Starttime,Endtime);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<AttendanceVo> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

}
