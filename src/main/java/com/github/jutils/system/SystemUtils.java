package com.github.jutils.system;

import com.github.jutils.string.StringUtils;

import java.lang.management.ManagementFactory;

/**
 * @author shimanqiang
 * @since 2018/4/19 上午11:51
 */
public abstract class SystemUtils {

    /**
     * 获取应用的进程ID
     * pid
     *
     * @return
     */
    public static final String getAppPid() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        if (StringUtils.isNotEmpty(name)) {
            return name.split("@")[0];
        }
        return null;
    }

    /**
     * 获取jdk版本
     *
     * @return
     */
    public static final String getJdkVersion() {
        return System.getProperty("java.version");
    }

    /**
     * 获取用户目录
     *
     * @return
     */
    public static final String getUserDir() {
        return System.getProperty("user.home");
    }

    /**
     * 获取系统名称
     *
     * @return
     */
    public static final String getOSName() {
        return System.getProperty("os.name");
    }

    /**
     * 判断是32位还是64位
     *
     * @return
     */
    public static final String getOSArch() {
        return System.getProperty("sun.arch.data.model");
    }


    /**
     * ////////////////JDK版本判断//////////////////
     *
     * @return
     */
    public static boolean isJdk9() {
        String jdkVersion = getJdkVersion();
        if (StringUtils.isNotEmpty(jdkVersion)
                && jdkVersion.contains("1.9.")) {
            return true;
        }
        return false;
    }

    public static boolean isJdk8() {
        String jdkVersion = getJdkVersion();
        if (StringUtils.isNotEmpty(jdkVersion)
                && jdkVersion.contains("1.8.")) {
            return true;
        }
        return false;
    }

    public static boolean isJdk7() {
        String jdkVersion = getJdkVersion();
        if (StringUtils.isNotEmpty(jdkVersion)
                && jdkVersion.contains("1.7.")) {
            return true;
        }
        return false;
    }

    public static boolean isJdk6() {
        String jdkVersion = getJdkVersion();
        if (StringUtils.isNotEmpty(jdkVersion)
                && jdkVersion.contains("1.6.")) {
            return true;
        }
        return false;
    }

    public static boolean isJdk5() {
        String jdkVersion = getJdkVersion();
        if (StringUtils.isNotEmpty(jdkVersion)
                && jdkVersion.contains("1.5.")) {
            return true;
        }
        return false;
    }
}
