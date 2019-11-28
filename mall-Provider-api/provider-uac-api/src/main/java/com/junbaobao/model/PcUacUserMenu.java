package com.junbaobao.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class PcUacUserMenu implements Serializable {
    /**
    * 用户id
    */
    private Long userId;

    /**
    * 菜单id
    */
    private Long menuId;

    private Integer number;

    private static final long serialVersionUID = 1L;
}