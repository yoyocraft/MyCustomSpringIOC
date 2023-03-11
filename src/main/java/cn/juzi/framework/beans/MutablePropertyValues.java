package cn.juzi.framework.beans;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * 用于存储和存储多个PropertyValue对象
 * 对应bean标签下多个property标签
 *
 * @author codejuzi
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    /**
     * 存储PropertyValue对象
     */
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = Optional.ofNullable(propertyValueList).orElse(new ArrayList<>());
    }

    /**
     * @return 以数组的形式返回所有的PropertyValue对象
     */
    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * 根据name属性值获取PropertyValue对象
     *
     * @param propertyValueName name属性
     * @return PropertyValue对象
     */
    public PropertyValue getPropertyValueByName(String propertyValueName) {
        if (StringUtils.isBlank(propertyValueName)) {
            return null;
        }
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValueName.equals(propertyValue.getName())) {
                return propertyValue;
            }
        }
        return null;
    }

    /**
     * 判断集合是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    /**
     * @param propertyValue 添加的PropertyValue对象
     * @return this，实现链式编程
     */
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        // 判重，如果重复则覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue currentPropertyValue = propertyValueList.get(i);
            if (currentPropertyValue.getName().equals(propertyValue.getName())) {
                propertyValueList.set(i, propertyValue);
                return this;
            }
        }
        this.propertyValueList.add(propertyValue);
        return this;
    }

    /**
     * @param propertyName name属性值
     * @return 判断是否有指定name属性值的对象
     */
    public boolean contains(String propertyName) {
        return getPropertyValueByName(propertyName) != null;
    }

    /**
     * @return 迭代器对象
     */
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
}
