package com.study.rest.dto;

import lombok.Data;
import lombok.ToString;

@Data   //객체를 문자열로 출력
public class ReqStudentDto {
    private String schoolName;
    private String department;
    private int grade;
    private String name;
}
