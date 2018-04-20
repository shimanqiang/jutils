package com.github.jutils;

/**
 * @author shimanqiang
 * @since 2018/4/19 上午11:59
 */
public class JutilsTest {
    public static void main(String[] args) {
        System.out.println(Jutils.System.getAppPid());
        if (Jutils.String.isEmpty(null)) {
            System.out.println("string is empty");
        }
        System.out.println(Jutils.System.getJdkVersion());
        System.out.println(Jutils.System.getOSArch());
        System.out.println(Jutils.System.isJdk7());
        System.out.println(Jutils.System.isJdk8());

        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.vendor.url"));
    }
}
