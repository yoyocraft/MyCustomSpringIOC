package cn.juzi.framework.context.support;

import cn.juzi.framework.beans.factory.support.BeanDefinitionReader;
import cn.juzi.framework.beans.factory.support.BeanDefinitionRegistry;
import cn.juzi.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * ApplicationContext接口的子实现类，用于立即加载
 *
 * @author codejuzi
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    /**
     * 解析器变量
     */
    protected BeanDefinitionReader beanDefinitionReader;

    /**
     * 用于存储bean对象的map容器
     */
    protected Map<String, Object> singletonObjectMap = new HashMap<>();

    /**
     * 配置文件路径
     */
    protected String configLocation;


    @Override
    public void refresh() throws IllegalStateException, Exception {
        // 加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        // 加载bean
        finishBeanInitialization();
    }

    /**
     * bean 的立即初始化
     *
     * @throws Exception
     */
    public void finishBeanInitialization() throws Exception {
        // 获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        // 获取beanDifinition对象名称
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            // bean初始化
            getBean(beanName);
        }
    }

}
