package com.out.project.common.exception;

/**
 * FileName: LogicErrorException
 * Description: 逻辑错误
 *
 * @author 林刚
 * date: 2020/11/2
 */
public class LogicException extends SystemException {

    public LogicException(BaseExceptionEnum exceptionEnum, String message, Throwable cause) {
        super(message, exceptionEnum.getCode(), cause);
    }

    public LogicException() {
        this(BaseExceptionEnum.LOGIC_ERROR.getCode(), BaseExceptionEnum.LOGIC_ERROR.getMessage());
    }

    public LogicException(String msg) {
        super(BaseExceptionEnum.LOGIC_ERROR.getCode(), msg, null);
    }

    public LogicException(String code, String message) {
        super(message, code);
    }

    public LogicException(BaseExceptionEnum ec) {
        this(ec, ec.getMessage(), null);
    }

    public LogicException(BaseExceptionEnum ec, String message) {
        this(ec, message, null);
    }

    public LogicException(BaseExceptionEnum ec, Throwable cause) {
        this(ec, ec.getMessage(), cause);
    }


}
