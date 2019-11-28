package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Databasechangeloglock implements Serializable {
    private Integer id;

    private Boolean locked;

    private Date lockgranted;

    private String lockedby;

    private static final long serialVersionUID = 1L;
}