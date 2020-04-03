package com.imooc.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author Miracle Luna
 * @Date 2020/4/2 15:02
 * @Version 1.0
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum RoleEnum {
	BUYER(1, "买家"),
	SELLER(2, "卖家");

	private Integer code;

	private String message;
}
