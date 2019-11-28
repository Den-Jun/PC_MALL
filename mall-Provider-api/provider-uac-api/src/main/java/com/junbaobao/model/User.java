package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
    private Long id;

    private static final long serialVersionUID = 1L;
}