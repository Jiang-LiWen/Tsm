package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Memorandumattachment;
import com.trkj.tsm.entity.Student;
import com.trkj.tsm.entity.Studentstatus;
import com.trkj.tsm.service.StudentService;
import com.trkj.tsm.service.StudentstatusService;
import com.trkj.tsm.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentstatusService studentstatusService;

    @GetMapping("/selectStudentLike")
    public PageInfo<StudentVo> selectStudentLike(@RequestParam("currentPage") int currentPage,
                                                @RequestParam("pagesize") int pagesize,
                                                @RequestParam("sech") String likeke){
        log.debug("分页查询信息---------------------------------------------------"+likeke);
        String likekes="%"+likeke+"%";
        PageHelper.startPage(currentPage,pagesize);
        List<StudentVo> entityPage =studentService.selectStudentLike(likekes);
        PageInfo<StudentVo> studentVoPageInfo = new  PageInfo<>(entityPage);
        return studentVoPageInfo;
    }

    @PutMapping("/updateStudent")
    public AjaxResponse updateStudent(@RequestBody @Valid StudentVo studentVo){
        studentVo.setUpdatetime(new Date());
        log.debug("修改学员---------------------------------------------------");
        studentService.updateStudent(studentVo);
        return AjaxResponse.success(studentVo);
    }

    @PutMapping("/deleteStudent")
    public AjaxResponse deleteStudent(@RequestBody @Valid StudentVo studentVo){
        studentVo.setDeletetime(new Date());
        log.debug("删除学员---------------------------------------------------");
        studentService.deleteStudent(studentVo);
        return AjaxResponse.success(studentVo);
    }

    @PostMapping("/insertStudent")
    public AjaxResponse insertStudent(@RequestBody @Valid RegisterVo registerVo){
        Student student=new Student();
        student.setRegisterId(registerVo.getRegisterId());
        student.setStudentName(registerVo.getConsultant());
        student.setSex(registerVo.getSex());
        student.setStudytime(new Date());
        log.debug("新增学员");
        studentService.insertStudent(student);

        Studentstatus studentstatus=new Studentstatus();
        studentstatus.setStudentId(student.getStudentId());
        studentstatus.setSignuptime(new Date());
        log.debug(studentstatus+"------------------------------------------------------------------------------------");
        Studentstatus studentstatus1=studentstatusService.insertStudentstatus(studentstatus);
        log.debug(studentstatus1+"------------------------------------------------------------------------------------");

        return AjaxResponse.success(student);
    }
}
