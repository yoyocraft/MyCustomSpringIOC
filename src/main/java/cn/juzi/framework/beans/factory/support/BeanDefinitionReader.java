package cn.juzi.framework.beans.factory.support;

/**
 * 解析配置文件规范
 *
 * @author codejuzi
 */
public interface BeanDefinitionReader {
    /**
     * 获取注册表对象
     *
     * @return 注册表对象
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 加载配置文件并在注册表中进行注册
     *
     * @param configLocation 配置文件路径
     * @throws Exception
     */
    void loadBeanDefinitions(String configLocation) throws Exception;
}
