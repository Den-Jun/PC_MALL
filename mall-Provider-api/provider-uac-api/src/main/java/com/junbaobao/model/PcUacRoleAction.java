package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcUacRoleAction implements Serializable {
    private Long roleId;

    private Long actionId;

    private static final long serialVersionUID = 1L;
}