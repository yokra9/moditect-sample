package com.github.yokra9.moditectSample;

import org.apache.commons.codec.binary.Base64;

public class Binary {
    public static void main(String[] args) {

        String target = "あいうえお";
        byte[] encodedBytes = Base64.encodeBase64(target.getBytes());
        System.out.println(new String(encodedBytes));
    }
}