package cn.juzi.framework.beans;

/**
 * 用于封装bean标签数据
 * 1.id属性
 * 2.class属性
 * 3.property属性（集合）
 *
 * @author codejuzi
 */
public class BeanDefinition {

    private String id;

    private String className;

    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutablePropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MutablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
