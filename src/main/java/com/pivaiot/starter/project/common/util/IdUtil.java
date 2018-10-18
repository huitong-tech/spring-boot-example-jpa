package com.pivaiot.starter.project.common.util;

import java.util.UUID;

public class IdUtil {

    private IdUtil() {}

    /**
     * 生成标准的UUID字符串
     *
     * @return UUID 字符串，带有减号分隔
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 生成不带减号分隔的UUID字符串
     *
     * @return 不带减号分隔的UUID字符串
     */
    public static String simpleUuid() {
        UUID uuid = UUID.randomUUID();
        long mostSigBits = uuid.getMostSignificantBits();
        long leastSigBits = uuid.getLeastSignificantBits();
        return (digits(mostSigBits >> 32, 8) +
                digits(mostSigBits >> 16, 4)  +
                digits(mostSigBits, 4) +
                digits(leastSigBits >> 48, 4) +
                digits(leastSigBits, 12));
    }

    private static String digits(long val, int digits) {
        long hi = 1L << (digits * 4);
        return Long.toHexString(hi | (val & (hi - 1))).substring(1);
    }
}
