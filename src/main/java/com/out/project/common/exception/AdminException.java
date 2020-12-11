package com.out.project.common.exception;

/**
 * FileName: AdminException
 * Description: 
 *
 * @author 林刚
 * date: 2020/11/2
 */
public class AdminException extends SystemException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public AdminException(BaseExceptionEnum exceptionEnum, String message, Throwable cause) {
        super(message, exceptionEnum.getCode(), cause);
    }

    public AdminException() {
    }

    public AdminException(String message) {
        this(BaseExceptionEnum.UNKNOWN_ERROR, message);
    }

    public AdminException(String code, String message) {
        super(message, code);
    }

    public AdminException(BaseExceptionEnum ec) {
        this(ec, ec.getMessage(), null);
    }

    public AdminException(BaseExceptionEnum ec, String message) {
        this(ec, message, null);
    }

    public AdminException(BaseExceptionEnum ec, Throwable cause) {
        this(ec, ec.getMessage(), cause);
    }
}
