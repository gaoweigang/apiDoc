package com.gwg.demo.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentDto implements Serializable{

    private Integer id;

    private String name;

    private String code;

    private Integer age;
}
