package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

import java.util.Map;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 17:47
 */
public interface ListableBeanFactory extends BeanFactory {


    /**
     * 按照类型返回Bean实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有Bean的名称
     * @return
     */
    String[] getBeanDefinitionNames();


}