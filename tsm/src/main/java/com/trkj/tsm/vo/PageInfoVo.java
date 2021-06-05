package com.trkj.tsmvueboot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

@Validated
@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor

public class PageInfoVo {
    private Integer currentPage;
    private Integer pagesize; //每页多少
    private Integer total; //总条数
}
