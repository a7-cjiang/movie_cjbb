package com.fh.common.config;

import com.fh.common.intercepter.KuayuIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginIntercepterConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册跨域拦截器
        InterceptorRegistration kuayu = registry.addInterceptor(new KuayuIntercepter());
        kuayu.addPathPatterns("/**"); //所有路径都被拦截


    }
}
