define({ "api": [
  {
    "type": "post",
    "url": "/api/student/getStudentInfo",
    "title": "查询学生信息",
    "version": "1.0.0",
    "group": "APP",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>学生姓名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "code",
            "description": "<p>学号</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "响应体-data": [
          {
            "group": "响应体-data",
            "type": "Integer",
            "optional": false,
            "field": "student.id",
            "description": "<p>记录ID</p>"
          },
          {
            "group": "响应体-data",
            "type": "String",
            "optional": false,
            "field": "student.name",
            "description": "<p>学生名字</p>"
          },
          {
            "group": "响应体-data",
            "type": "String",
            "optional": false,
            "field": "student.code",
            "description": "<p>学号</p>"
          },
          {
            "group": "响应体-data",
            "type": "Integer",
            "optional": false,
            "field": "student.age",
            "description": "<p>年龄</p>"
          }
        ],
        "响应体": [
          {
            "group": "响应体",
            "type": "int",
            "optional": false,
            "field": "code",
            "description": "<p>0表示成功</p>"
          },
          {
            "group": "响应体",
            "type": "String",
            "optional": false,
            "field": "message",
            "description": "<p>提示信息</p>"
          },
          {
            "group": "响应体",
            "type": "boolean",
            "optional": false,
            "field": "success",
            "description": "<p>true表示成功,false表示失败</p>"
          },
          {
            "group": "响应体",
            "type": "T",
            "optional": false,
            "field": "data",
            "description": "<p>响应数据</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n   \"id\": 1,\n   \"name\": \"gaoweigang\",\n   \"code\": \"123456\",\n   \"age\": 22\n}",
          "type": "json"
        }
      ]
    },
    "filename": "./src/main/java/com/gwg/demo/controller/StudentController.java",
    "groupTitle": "APP",
    "name": "PostApiStudentGetstudentinfo"
  }
] });
