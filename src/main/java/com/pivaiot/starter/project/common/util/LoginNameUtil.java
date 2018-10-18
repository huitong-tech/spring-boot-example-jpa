package com.pivaiot.starter.project.common.util;


/**
 * 判断登录名称类型.
 */
public class LoginNameUtil {
    public enum LoginNameEnum {
        MOBILE, EMAIL, USERNAME
    }

    public static LoginNameEnum decide(String loginName) {
        int digitalCount = 0;
        for (char c : loginName.toCharArray()) {
            if (c == '@') {
                return LoginNameEnum.EMAIL;
            }

            if (c >= '0' && c <= '9') {
                digitalCount ++;
            }
        }

        if (digitalCount == loginName.length())
            return LoginNameEnum.MOBILE;

        return LoginNameEnum.USERNAME;
    }
}
