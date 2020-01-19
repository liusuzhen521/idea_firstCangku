package cn.bdqn.springboot.controller;



import cn.bdqn.springboot.entity.User;
import cn.bdqn.springboot.service.IUserService;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.management.Query;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangxiangyang
 * @since 2020-01-14
 */
//@RestController   ==@ResponseBody+@Controller
@Controller
@RequestMapping("/user")
public class UserController {


    //实例化Service层
    @Resource
    private IUserService iUserService;



    //***********************************1.Service CRUD接口 *********************************************
    /*方法
     查询所有用户  mapper,service没有写，用mybatis-plus自定的方法 很方便
     有两种 1.Service CRUD接口  2.Mapper Service接口
     */
    @RequestMapping("/list")
    @ResponseBody
    public String list(){

        //分页
        IPage<User> iPage=new Page<User>();
        iPage.setCurrent(1);  //当前页码
        iPage.setSize(5);   //页面容量
        IPage<User> userList=  iUserService.page(iPage);   //page() 分页专用

        System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPpp");
        System.out.println("当前页码："+iPage.getCurrent());
        System.out.println("总页数："+iPage.getPages());
        System.out.println("集合："+iPage.getRecords());
        System.out.println("页面容量："+iPage.getSize());
        System.out.println("总记录数："+iPage.getTotal());


        //List<User> userList=iUserService.list();  // list()查询所有
        return JSONArray.toJSONString(userList);
    }



    /*方法
     按条件查询用户  mapper,service没有写，用mybatis-plus自定的方法 很方便
     有两种 1.Service CRUD接口  2.Mapper Service接口
     条件构造器
     */
    @RequestMapping("/listtj")
    @ResponseBody
    public String list2(){

        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();   //QueryWrapper继承自AbstractWrapper
        //queryWrapper.eq("userCode","admin");   //userCode=admin
        //queryWrapper.eq("userPassword","1234567");  //userPassword=1234567
        //queryWrapper.like("userName","赵");  //模糊查询
        queryWrapper.in("id",1,2,3);  //1或2或3



        List<User> userList=iUserService.list(queryWrapper);  // list(xx)根据条件查询

        return JSONArray.toJSONString(userList);
    }


    /*方法
    添加用户
    */
    @RequestMapping("/adduser")
    @ResponseBody
    public Boolean list9(){

       User u=new User();
       u.setUserName("张三");
       u.setUserPassword("123456");

       Boolean b=iUserService.save(u);    //save()  插入对象   成功返回true

        return b;
    }


    /*方法
       修改
       */
    @RequestMapping("/update")
    @ResponseBody
    public String list6(){

        User u=new User();
        u.setId((long) 19);
        u.setUserName("李四");
        u.setUserPassword("123456");

        Boolean b=iUserService.updateById(u);    //updateById()  根据id修改  成功返回true

        return "xxxx "+b;
    }


    /*方法
       修改
       */
    @RequestMapping("/del")
    @ResponseBody
    public String list7(){

        User u=new User();
        u.setId((long) 19);

        Boolean b=iUserService.removeById(u);    //removeById()  根据id删除  成功返回true

        return "删除成功 "+b;
    }


    //***********************************2.Mapper Service接口 *********************************************

    /*方法
        查询所有用户
        */
    @RequestMapping("/listms")
    @ResponseBody
    public String list4(){

        //调手写方法
        List<User> userList=iUserService.findAll();

        return JSONArray.toJSONString(userList);
    }






    //***********************************3.sql手写 *********************************************
     /*方法
     查询所有用户
     */
    @RequestMapping("/listsx")
    public String list3(Model m, HttpSession session){

       //调手写方法
        List<User> userList=iUserService.findAllUser();


                m.addAttribute("msg","model存的值");
                session.setAttribute("msg2","session存的值");
                m.addAttribute("userlist",userList);  //集合
                m.addAttribute("date",new Date());   //时间
                m.addAttribute("count",1);
                m.addAttribute("user",userList.get(0));   //一个具体的用户对象

        System.out.println("****************************SpringBoot**132***********************");

        return "index";
    }





    //***********************************页面跳转专用 *********************************************
    @RequestMapping("/hellowlj")
    public String list5(@RequestParam(value = "ab",required = false) String abc){

        System.out.println("AAAAAAAAAAAAAAAAAAAAAA"+abc);
        return "hellow";
    }

}
