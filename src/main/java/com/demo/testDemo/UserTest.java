package com.demo.testDemo;

import com.demo.bean.Emp;
import com.demo.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void addTest(){
        System.out.println();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        UserService userService = applicationContext.getBean("rew", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void BeanTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }

}
