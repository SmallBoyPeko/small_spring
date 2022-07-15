package cn.bugstack.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Small-Spring
 * <p>
 * 描述:
 * <p>
 *
 * @author Administrator
 * <p>
 * Date 2022/7/15 16:37
 */
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1001", "小福哥");
        hashMap.put("1002", "八杯水");
        hashMap.put("1003", "阿毛");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}