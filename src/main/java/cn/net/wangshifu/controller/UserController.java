package cn.net.wangshifu.controller;

import cn.net.wangshifu.dao.UserDao;
import cn.net.wangshifu.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao=(UserDao) context.getBean("userDao");
        User user=new User();
        user.setId(10001);
        user.setNickname("王宇");
        user.setPassword("ziyouzizai");
        userDao.authUser(user);
    }
}
