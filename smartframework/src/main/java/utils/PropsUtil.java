package utils;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.Properties;

/**
 * 获取配置文件的工具类
 *
 */
public class PropsUtil {

    public static final Logger LOGGER = Logger.getLogger(PropsUtil.class);

    public static Properties getProps(String propertiesPath){

        Properties prop = new Properties();
        InputStream is = null;
        File file = new File(propertiesPath);

        try {
            is = new FileInputStream(file);
            prop.load(is);
        } catch (IOException e) {
            LOGGER.error("get prorertise file error");
        }

        return prop;
    }

}
