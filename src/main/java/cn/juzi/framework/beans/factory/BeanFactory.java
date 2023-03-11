package cn.juzi.framework.beans.factory;

/**
 * IOC容器父接口
 *
 * @author codejuzi
 */
public interface BeanFactory {
    /**
     * 根据Bean的名称获取Bean对象
     *
     * @param name beanName
     * @return Bean对象
     * @throws Exception
     */
    Object getBean(String name) throws Exception;

    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
