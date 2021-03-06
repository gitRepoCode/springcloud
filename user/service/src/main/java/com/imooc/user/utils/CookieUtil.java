package com.imooc.user.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Miracle Luna
 * @Date 2020/4/2 14:02
 * @Version 1.0
 */
public class CookieUtil {

	/**
	 * 设置cookie
	 * @param response
	 * @param name
	 * @param value
	 * @param maxAge
	 */
	public static void set(HttpServletResponse response,
						   String name,
						   String value,
						   int maxAge) {
		Cookie cookie = new Cookie(name, value);
		cookie.setPath("/");
		cookie.setMaxAge(maxAge);
		response.addCookie(cookie);
	}

	public static Cookie get(HttpServletRequest request,
							 String name) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie: cookies) {
				if (name.equals(cookie.getName())) {
					return cookie;
				}
			}
		}

		return null;
	}
}
