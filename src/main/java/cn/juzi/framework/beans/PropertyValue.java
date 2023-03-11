package cn.juzi.framework.beans;

/**
 * 用于封装bean标签下property的属性
 * 1. name
 * 2. ref
 * 3. value => 此处用于给基本数据类型及String类型数据赋值
 *
 * @author codejuzi
 */
public class PropertyValue {

    private String name;

    private String ref;

    private String value;

    public PropertyValue() {
    }

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
