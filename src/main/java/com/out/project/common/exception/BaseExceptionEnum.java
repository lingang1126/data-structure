package com.out.project.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * FileName: BaseExceptionEnum
 * Description: 
 *
 * @author 林刚
 * date: 2020/11/2
 */
@Getter
@AllArgsConstructor
public enum BaseExceptionEnum {

    PARAMETER_ERROR("99993", "参数错误"),
    NO_AUTH("99994", "授权异常"),
    IMPORT_ERROR("50001", "导入异常"),
    PAGE_PARAM_ERROR("99995", "分页参数异常"),
    ID_IS_NULL("99996", "ID不能为空"),
    BIZ_ERROR("99997", "业务异常"),
    PARAM_ERROR("99998", "参数校验错误"),
    COMMON_ERROR("99999", "通用异常"),


    LOGIC_ERROR("-2", "logic error"),
    UNKNOWN_ERROR("-1", "unknown error");


    private String code;
    private String message;
}
