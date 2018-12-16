package utils;

import java.util.Properties;

/**
 * 全局变量工具，用于获取全局变量
 */
public class GlobalConfigUtil {

    private static final Properties CONFIG_PROP = PropsUtil.getProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取JDBC驱动
     */
    public static String getJdbcDriver(){
        return CONFIG_PROP.getProperty(ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取JDBCURL
     */
    public static String getJdbcUrl(){
        return CONFIG_PROP.getProperty(ConfigConstant.JDBC_URL);
    }

    /**
     * 获取JDBC用户名
     */
    public static String getJdbcUsername(){
        return CONFIG_PROP.getProperty(ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取JDBC密码
     */
    public static String getJdbcPassword(){
        return CONFIG_PROP.getProperty(ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包
     */
    public static String getBasePackage(){
        return CONFIG_PROP.getProperty(ConfigConstant.APP_BASH_PACKAGE);
    }

    /**
     * 获取JSP路径
     */
    public static String getJspPath(){
        return CONFIG_PROP.getProperty(ConfigConstant.APP_JSP_PATH);
    }

    /**
     * 获取静态资源路径
     */
    public static String getAssetPath(){
        return CONFIG_PROP.getProperty(ConfigConstant.APP_ASSET_PATH);
    }
}
