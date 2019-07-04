1.安装apiDoc
安装node.js

安装apiDoc
npm install apidoc -g

2.项目配置
在你的项目根目录下新建apidoc.json文件，该文件描述了项目对外提供接口的概要信息如名称、版本、描述、文档打开时浏览器显示标题和接口缺省访问地址。
{
  "name": "apiDoc test API文档",
  "version": "1.0.0",
  "description": "开发环境地址：http://192.168.1.1:8080 </br> 测试环境服务地址：http://172.168.2.2:8080",
  "apidoc": {
    "title": "apiDoc API文档",
    "url" : "http://{host}",
    "order" : ["APP"]
  }
}

3.编写测试样例

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

说明：
①HTTP接口调用方法、路径及名称
@api
@api {method} path [title]

②api 版本号
@apiVersion
@apiVersion version

③api 名称
@apiName
@apiName name

④api 分组
@apiGroup
@apiGroup name

⑤请求头参数
@apiHeader
@apiHeader [(group)] [{type}] [field=defaultValue] [description]

⑥请求参数
@apiParam
@apiParam [(group)] [{type}] [field=defaultValue] [description]

⑦返回数据描述
@apiSuccess
@apiSuccess [(group)] [{type}] field [description]

⑧接口成功返回样例
@apiSuccessExample
@apiSuccessExample [{type}] [title]
                   example

⑨接口失败描述
@apiError
@apiError [(group)] [{type}] field [description]

⑩接口失败返回样例
@apiErrorExample
@apiErrorExample [{type}] [title]
                 example

  
(11)类似于宏定义，可以被引用
@apiDefine
@apiDefine name [title]
                     [description]

(12)使用@apiDefine定义的描述
@apiUse
@apiUse name


更详细的说明请参考官方文档http://apidocjs.com

4.生成文档
cd到apidoc.json所在路径（即项目根目录）执行如下命令即可
apidoc -i . -o  apidoc/



5.点开apidoc文件夹中index.html会发现已经生成的漂亮的api文档

