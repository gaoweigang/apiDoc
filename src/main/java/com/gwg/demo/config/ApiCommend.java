package com.gwg.demo.config;

/**
 * apiDoc 通用配置
 */
public class ApiCommend {

    /**
     * @apiDefine global_api_code
     *
     * @apiSuccess (响应体) {int} code 0表示成功
     * @apiSuccess (响应体) {String} message 提示信息
     * @apiSuccess (响应体) {boolean} success true表示成功,false表示失败
     * @apiSuccess (响应体) {T} data 响应数据
     */
}
