package cn.bugstack.springframework.beans;

import cn.hutool.core.bean.BeanException;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 17:40
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}