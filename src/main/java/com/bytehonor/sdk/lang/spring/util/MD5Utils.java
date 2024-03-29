package com.bytehonor.sdk.lang.spring.util;

import java.util.Objects;

/**
 * MD5 utils
 * 
 * @author lijianqiang
 *
 */
public class MD5Utils {

    public static String md5(String src) {
        Objects.requireNonNull(src, "src");
        return SimpleDigestUtils.md5DigestAsHex(src.getBytes());
    }
}
