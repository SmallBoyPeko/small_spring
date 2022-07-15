package cn.bugstack.springframework.beans.factory.config;

/**
 * Small-Spring
 * </P>
 * 描述:
 * </P>
 *
 * @author Administrator
 * </P>
 * Date 2022/6/7 11:34
 */
public class BeanDefinition {
    private Class beanClass;
    
    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}