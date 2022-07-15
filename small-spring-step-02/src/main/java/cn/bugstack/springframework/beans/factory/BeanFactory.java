package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * Small-Spring
 * </P>
 * 描述:
 * </P>
 * @author Administrator
 * </P>
 * Date 2022/6/7 11:32
 */
public interface BeanFactory {
     Object getBean(String name) throws BeansException;
}