package cn.bdqn.springboot.config;

import cn.bdqn.springboot.util.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义配置器
 */
@Configuration
public class MyWebMvcCnfigurer {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer(){
            /**
             * 访问主页/ 或 /index.html  来到hellow.html  或 hellow.jsp
             * @param registry
             */
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("hellow");
                registry.addViewController("/index.html").setViewName("hellow");
            }


            /**
             * 注册拦截器
             * 对于静态资源 .css .js
             * springboot已经做好了静态资源
             * @param registry
             */
           @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new Interceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/","/index.html","/user/listsx");
                //模拟 登录拦截，拦截所有路径 除了 /，进入登录页面的路径，登录操作路径

            }
        };
    }
}
