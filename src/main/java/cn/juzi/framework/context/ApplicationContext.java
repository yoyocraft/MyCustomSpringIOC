package cn.juzi.framework.context;

import cn.juzi.framework.beans.factory.BeanFactory;

/**
 * @author codejuzi
 */
public interface ApplicationContext extends BeanFactory {
    /**
     * 进行配置文件加载并进行对象创建
     *
     * @throws IllegalStateException
     * @throws Exception
     */
    void refresh() throws IllegalStateException, Exception;
}
