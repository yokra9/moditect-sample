package com.github.yokra9.moditectSample;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.net.URLCodec;

public class Net {
    public static void main(String[] args) {

        String target = "あいうえお";
        URLCodec codec = new URLCodec("UTF-8");
        try {
            System.out.println(codec.encode(target));
        } catch (EncoderException e) {
            e.printStackTrace();
        }
    }
}