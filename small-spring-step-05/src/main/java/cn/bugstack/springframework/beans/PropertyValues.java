package cn.bugstack.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 17:42
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        this.propertyValueList.add(propertyValue);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyValue) {
        for (PropertyValue value : this.propertyValueList) {
            if (value.getName().equals(propertyValue)) {
                return value;
            }
        }
        return null;
    }
}