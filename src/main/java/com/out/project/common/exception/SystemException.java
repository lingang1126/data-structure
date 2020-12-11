package com.out.project.common.exception;

/**
 * FileName: SystemException
 * Description:
 *
 * @author 林刚
 * date: 2020/11/2
 */
public class SystemException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -360277845666981697L;
    private java.lang.String errorCode;

    public SystemException() { /* compiled code */ }

    public SystemException(java.lang.String message) { /* compiled code */ }

    public SystemException(java.lang.String message, java.lang.Throwable cause) { /* compiled code */ }

    public SystemException(java.lang.String message, java.lang.String errorCode) { /* compiled code */ }

    public SystemException(java.lang.String message, java.lang.String errorCode, java.lang.Throwable cause) { /* compiled code */ }

    // public java.lang.String getErrorCode() { /* compiled code */ }

    public void setErrorCode(java.lang.String errorCode) { /* compiled code */ }
}