package com.junbaobao.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PersistentLogins implements Serializable {
    private String series;

    private String username;

    private String token;

    private Date lastUsed;

    private static final long serialVersionUID = 1L;
}