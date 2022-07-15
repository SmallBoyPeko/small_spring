import cn.bugstack.springframework.BeanDefinition;
import cn.bugstack.springframework.BeanFactory;
import cn.bugstack.springframework.test.bean.UserService;
import com.sun.xml.internal.ws.developer.ServerSideException;
import org.junit.Test;
import sun.plugin.com.BeanDispatchImpl;

/**
 * Small-Spring
 *
 * @author Administrator
 * Date 2022/6/7 11:16
 */
public class ApiTest {
    /**
     * 这里包括了
     *  初始化Bean工厂
     *  注册Bean
     *  获取Bean
     * 三个步骤，使用效果与Spring贴近
     */
    @Test
    public void test_BeanFactory() {
        //1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}