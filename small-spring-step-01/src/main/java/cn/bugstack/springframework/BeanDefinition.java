package cn.bugstack.springframework;

/**
 * @author Administrator
 * Date 2022/6/7 11:11
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}