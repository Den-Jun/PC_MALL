package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcUacRoleUser implements Serializable {
    private Long roleId;

    private Long userId;

    private static final long serialVersionUID = 1L;
}