package cn.bugstack.springframework.beans;

/**
 * Small-Spring
 * </P>
 * 描述:
 * </P>
 *
 * @author Administrator
 * </P>
 * Date 2022/6/7 11:32
 */
public class BeansException extends Throwable {
    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BeansException(String msg) {
        super(msg);
    }
}