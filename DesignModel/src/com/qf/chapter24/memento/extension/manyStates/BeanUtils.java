package com.qf.chapter24.memento.extension.manyStates;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ios on 16/11/15.
 */
public class BeanUtils {
    //把bean中的所有属性和数值都放入hashmap中
    public static HashMap<String, Object> backupProp(Object bean){
        HashMap<String, Object> result = new HashMap<String, Object>();
        try {
            //获得Bean的描述
            //The Introspector class provides a standard way for tools to learn about
            //the properties, events, and methods supported by a target Java Bean.
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor des: descriptors) {
                String fieldName = des.getName();
                Method getter = des.getReadMethod();
                Object fieldValue = getter.invoke(bean, new Object[] {});
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    //把hashmap中的值,返回到bean中
    public static void restoreProp(Object bean, Map<String, Object> propMap) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des: descriptors) {
                String fieldName = des.getName();
                if (propMap.containsKey(fieldName)) {
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, new Object[] {propMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
