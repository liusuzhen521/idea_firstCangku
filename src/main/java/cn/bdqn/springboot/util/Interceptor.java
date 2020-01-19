package cn.bdqn.springboot.util;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther:zxy
 * @Date:2020/1/18
 * @Description:springboot
 * @version:1.0
 */
public class Interceptor extends HandlerInterceptorAdapter {
    //调控制方法之前
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {


System.out.println("拦截器拦截器拦截器拦截器拦截器拦截器拦截器拦截器拦截器拦截器拦截器拦截器拦截器拦截器");
        return true;


      /*  if(request.getSession().getAttribute("u")!=null){  //有登录用户 放走
            System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiii已登录，有权限，放走");
            return true;

        }else {  //没有登录用户   抓住
            System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiii未登录，没有权限，抓住走");

            response.sendRedirect(request.getContextPath()+"/401.jsp");
            return false;
        }*/





    }
}
