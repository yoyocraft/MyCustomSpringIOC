package cn.juzi.framework.beans.factory.support;

import cn.juzi.framework.beans.BeanDefinition;

/**
 * 注册表对象
 *
 * @author codejuzi
 */
public interface BeanDefinitionRegistry {
    /**
     * 注册BeanDefinition对象到注册表中
     *
     * @param beanName       beanName
     * @param beanDefinition beanDefinition对象
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 从注册表中删除指定名称的BeanDefinition对象
     *
     * @param beanName beanName
     * @throws Exception
     */
    void removeBeanDefinition(String beanName) throws Exception;

    /**
     * 根据名称从注册表中获取BeanDefinition对象
     *
     * @param beanName beanName
     * @return BeanDefinition对象
     * @throws Exception
     */
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    /**
     * 根据beanName判断是否包含相应的BeanDefination对象
     *
     * @param beanName beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * @return BeanDefinition数量
     */
    int getBeanDefinitionCount();

    /**
     * @return 所有的bean名称
     */
    String[] getBeanDefinitionNames();
}