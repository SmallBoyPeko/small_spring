package cn.bugstack.springframework.beans.factory.config;

/**
 * Small-Spring
 * </P>
 * 描述:
 * </P>
 *
 * @author Administrator
 * </P>
 * Date 2022/6/7 11:36
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}