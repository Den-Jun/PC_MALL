package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcUacGroupUser implements Serializable {
    /**
    * 角色ID
    */
    private Long groupId;

    /**
    * 菜单ID
    */
    private Long userId;

    private static final long serialVersionUID = 1L;
}