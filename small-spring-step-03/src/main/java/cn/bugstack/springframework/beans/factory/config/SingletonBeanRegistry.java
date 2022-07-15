package cn.bugstack.springframework.beans.factory.config;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 14:56
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
