package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 17:56
 */
public interface BeanDefinitionRegistry {


    /**
     * 注册bean
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 根据BeanName获取Bean实例
     * @param beanName
     * @return
     */
    BeanDefinition getBeanDefinition(String beanName);

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 返回注册的所有Bean的名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
