package com.zking.eurekaprovider.uitl;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

public class ShiroUtils {
    public static Subject login(String configPath, String userName,
            String passWord) {
        // 读取配置文件,初始化SecurityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory(
                "classpath:"+configPath);

        // 获取到SecurityManager实例
        SecurityManager securityManager = factory.getInstance();

        // 把SecurityManager绑定到SecurityUtils中

        SecurityUtils.setSecurityManager(securityManager);
        // 得到当前用户
        Subject subject = SecurityUtils.getSubject();

        // 创建Token令牌,用户名/密码
        UsernamePasswordToken passwordToken = new UsernamePasswordToken(userName,
                passWord);
        // 验证登录 会抛出异常
        try {
            subject.login(passwordToken);
            System.out.println("身份验证成功!!!");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("身份验证失败!!!!");
        }
        return subject;
    }
}
