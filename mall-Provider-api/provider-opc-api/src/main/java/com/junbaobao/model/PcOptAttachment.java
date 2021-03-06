package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PcOptAttachment implements Serializable {
    /**
    * ID
    */
    private Long id;

    /**
    * 上传附件的相关业务流水号
    */
    private String refNo;

    /**
    * 中心名称(英文简写)
    */
    private String centerName;

    /**
    * 文件服务器根目录
    */
    private String bucketName;

    /**
    * 附件名称
    */
    private String name;

    /**
    * 附件存储相对路径
    */
    private String path;

    /**
    * 附件类型
    */
    private String type;

    /**
    * 附件格式
    */
    private String format;

    /**
    * 备注
    */
    private String description;

    /**
    * 版本号
    */
    private Long version;

    /**
    * 创建人
    */
    private String creator;

    /**
    * 创建人ID
    */
    private Long creatorId;

    /**
    * 创建日期
    */
    private Date createdTime;

    /**
    * 最后操作人
    */
    private String lastOperator;

    /**
    * 最后操作人ID
    */
    private Long lastOperatorId;

    /**
    * 更新日期
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}