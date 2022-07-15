package cn.bugstack.springframework.test;

import cn.bugstack.springframework.beans.factory.config.BeanDefinition;
import cn.bugstack.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.bugstack.springframework.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import javax.swing.plaf.basic.BasicEditorPaneUI;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 14:46
 */
public class ApiTest {
    @Test
    public void test_beanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 3. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 4.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "小傅哥");
        userService.queryUserInfo();
    }
    
    @Test
    public void testCglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"小福哥"});
        System.out.println(obj);
    }


    @Test
    public void test_newInstance() throws IllegalAccessException, InstantiationException {
        UserService userService = UserService.class.newInstance();
        System.out.println(userService);
    }
    
}