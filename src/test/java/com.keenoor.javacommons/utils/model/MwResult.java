package com.keenoor.javacommons.utils.model;

import java.io.Serializable;

import lombok.Data;

/**
 * Author:      chenliuchun
 * Date:        2018/6/5
 * Description: 中间件接口返回参数类
 * Modification History:
 * Date       Author       Version     Description
 * -----------------------------------------------------
 * @author clc
 */

@Data
public class MwResult<T> implements Serializable {

    private static final long serialVersionUID = -4179443440883499092L;
    private String code;
    private T detail;
}
