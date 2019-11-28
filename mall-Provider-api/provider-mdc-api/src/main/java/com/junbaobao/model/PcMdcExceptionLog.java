package com.junbaobao.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PcMdcExceptionLog {
    private Long id;

    /**
     * 系统应用名
     */
    private String applicationName;

    /**
     * 异常类型
     */
    private String exceptionSimpleName;

    /**
     * 异常信息(通过exception.getMessage()获取到的内容)
     */
    private String exceptionMessage;

    /**
     * 异常原因(通过exception.getCause()获取到的内容)
     */
    private String exceptionCause;

    /**
     * 异常堆栈信息
     */
    private String exceptionStack;

    /**
     * 操作者姓名
     */
    private String creator;

    /**
     * 操作者id
     */
    private Long creatorId;

    /**
     * 创建时间
     */
    private Date createTime;
}