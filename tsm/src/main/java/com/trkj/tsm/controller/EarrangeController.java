package com.trkj.tsm.controller;

import com.trkj.tsm.entity.Earrange;
import com.trkj.tsm.service.EarrangeService;
import com.trkj.tsm.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@Slf4j
public class EarrangeController {
    @Autowired
    private EarrangeService earrangeService;

    @PostMapping("/insertEarrange")
    public AjaxResponse insertEarrange(@RequestBody @Valid List<Object> biglist){
        List<Object> dates= (List<Object>) biglist.get(3);
        String start=String.valueOf(dates.get(0));
        String end=String.valueOf(dates.get(1));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dStart = null;
        Date dEnd = null;
        try {
            dStart = sdf.parse(start);
            dEnd = sdf.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cStart = Calendar.getInstance();
        cStart.setTime(dStart);

        List dateList = new ArrayList();
        //别忘了，把起始日期加上
        dateList.add(dStart);
        // 此日期是否在指定日期之后
        while (dEnd.after(cStart.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cStart.add(Calendar.DAY_OF_MONTH, 1);
            dateList.add(cStart.getTime());
        }

        //将得到的所有日期全部转为"yyyy-MM-dd"的String类型
        List<String> dateLists= new ArrayList<>();
        for(int a=0;a<dateList.size();a++){
            dateLists.add(new SimpleDateFormat("yyyy-MM-dd").format(dateList.get(a)));
        }
        List<Object> classroomLists= (List<Object>) biglist.get(0);
        List<Object> trainingperiodLists= (List<Object>) biglist.get(2);
        List<Object> classesLists= (List<Object>) biglist.get(1);

        for (int i=0;i<classesLists.size();i++){
            for (int i1=0;i1<classroomLists.size();i1++){
                for (int i2=0;i2<trainingperiodLists.size();i2++){
                    for (int i3=0;i3<dateLists.size();i3++){
                        Earrange earrange=new Earrange();
                        earrange.setEclassesId(Integer.parseInt(String.valueOf(classesLists.get(i))));
                        earrange.setEclassroomId(Integer.parseInt(String.valueOf(classroomLists.get(i1))));
                        earrange.setEperiodId(Integer.parseInt(String.valueOf(trainingperiodLists.get(i2))));
                        earrange.setEarrangedate(dateLists.get(i3));
                        Earrange earrangeInsert=earrangeService.insertEarrange(earrange);
                    }
                }
            }
        }

//        List<Earrange> earrangeList=earrangeService.selectAllEarrange();
//        for (int i4=0;i4<earrangeList.size();i4++){
//            if(earrangeList.get(i4).getClasses().getClassesRCount()>
//                    earrangeList.get(i4).getClassroom().getCatacity()){
//                Earrange earrangeDelete=earrangeService.deleteEarrangeById(earrangeList.get(i4).getEarrangeId());
//            }
//        }

        List<Earrange> earrangeListeClasses_Id=earrangeService.selectAllEarrangeGroupByeClasses_Id();
        List<Earrange> earrangeListTeacher_Id=earrangeService.selectAllEarrangeGroupByTeacher_Id();
        List<Integer> Classes1=new ArrayList<>();

        for (int j=0;j<earrangeListTeacher_Id.size();j++){
            int count=0;
            for (int j1=0;j1<earrangeListeClasses_Id.size();j1++){
                if(earrangeListTeacher_Id.get(j).getClasses().getTeacherId()==
                        earrangeListeClasses_Id.get(j1).getClasses().getTeacherId()){
                    count++;
                }
            }
            Classes1.add(count);
        }

        int num1=classroomLists.size()*trainingperiodLists.size()*dateLists.size();
        int num2=Collections.max(Classes1);
        int num3=num1/num2;

        return AjaxResponse.success(num3);
    }
}
