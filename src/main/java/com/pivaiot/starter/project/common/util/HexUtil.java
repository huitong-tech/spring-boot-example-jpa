package com.pivaiot.starter.project.common.util;

import com.google.common.io.BaseEncoding;

public class HexUtil {

    private HexUtil() {}

    public static byte[] decode(String hex) {
        return BaseEncoding.base16().decode(hex);
    }

    public static String encode(byte[] bytes) {
        return BaseEncoding.base16().lowerCase().encode(bytes);
    }
}
