package cn.juzi.framework.utils;


/**
 * IOC 工具类
 *
 * @author codejuzi
 */
public class IOCMethodUtils {

    private IOCMethodUtils(){}

    /**
     * 根据属性名获取Setter方法名
     *
     * @param fieldName 属性名
     * @return 方法名
     */
    public static String getSetterMethodByFieldName(String fieldName) {
        return "set" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);

    }
}
