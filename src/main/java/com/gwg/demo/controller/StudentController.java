package com.gwg.demo.controller;


import com.gwg.demo.common.Result;
import com.gwg.demo.request.StudentReqDto;
import com.gwg.demo.response.StudentDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {


    /**
     *
     * @api {post} /api/student/getStudentInfo 查询学生信息
     * @apiVersion 1.0.0
     * @apiGroup APP
     *
     *
     * @apiParam {String} name  学生姓名
     * @apiParam {String} code  学号
     *
     * @apiUse global_api_code
     *
     * @apiSuccess  (响应体-data) {Integer} student.id    记录ID
     * @apiSuccess  (响应体-data) {String}  student.name  学生名字
     * @apiSuccess  (响应体-data) {String}  student.code  学号
     * @apiSuccess  (响应体-data) {Integer} student.age   年龄
     *
     * @apiSuccessExample Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *        "id": 1,
     *        "name": "gaoweigang",
     *        "code": "123456",
     *        "age": 22
     *     }
     *
     *
     */
    @PostMapping(value = "/api/student/getStudentInfo")
    public @ResponseBody
    Result<StudentDto> getStudentInfo(@RequestBody StudentReqDto studentReqDto) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(1);
        studentDto.setName("gaoweigang");
        studentDto.setCode("123456");
        studentDto.setAge(22);
        return Result.success(studentDto);
    }

}
