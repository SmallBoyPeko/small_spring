package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

/**
 * Small-Spring
 * <p>
 * 描述: 实现了Bean的实例化操作newInstance
 *      处理完Bean对象的实例化后，直接调用addSingleton()方法存放到单例对象的缓存中去
 * <p>
 * @author Administrator
 * <p>
 * Date 2022/6/7 11:54
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(name, bean);
        return bean;
    }
}