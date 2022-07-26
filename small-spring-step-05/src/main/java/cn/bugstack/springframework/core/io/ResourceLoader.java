package cn.bugstack.springframework.core.io;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 17:35
 */
public interface ResourceLoader {
    
    String CLASSPATH_URL_PREFIX = "classpath:";
    
    Resource getResource(String  location);
}
