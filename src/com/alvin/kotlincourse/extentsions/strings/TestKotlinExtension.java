package com.alvin.kotlincourse.extentsions.strings;

import com.alvin.kotlincourse.extentions.strings.StringUtilKt;

public class TestKotlinExtension {
    public static void main(String[] args) {
        char hello = StringUtilKt.lastChar("Hello");
        System.out.println(hello);
    }
}

