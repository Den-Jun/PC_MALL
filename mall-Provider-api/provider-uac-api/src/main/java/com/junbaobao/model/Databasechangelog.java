package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Databasechangelog implements Serializable {
    private String id;

    private String author;

    private String filename;

    private Date dateexecuted;

    private Integer orderexecuted;

    private String exectype;

    private String md5sum;

    private String description;

    private String comments;

    private String tag;

    private String liquibase;

    private String contexts;

    private String labels;

    private String deploymentId;

    private static final long serialVersionUID = 1L;
}