package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcUacRoleMenu implements Serializable {
    /**
    * 角色ID
    */
    private Long roleId;

    /**
    * 菜单ID
    */
    private Long menuId;

    private static final long serialVersionUID = 1L;
}