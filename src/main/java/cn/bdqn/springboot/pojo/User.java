package cn.bdqn.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Auther:zxy
 * @Date:2020/1/12
 * @Description:springboot
 * @version:1.0
 */
public class User {

   // @Value("${a.b}")  //获取application.yml中的值
    private String userName;

    //*******构造方法********
    public User(String userName) {
        this.userName = userName;
    }

    public User() {

    }


    //*********getter,setter************


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



}
