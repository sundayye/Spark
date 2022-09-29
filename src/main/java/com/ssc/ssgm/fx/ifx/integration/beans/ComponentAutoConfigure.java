
package com.ssc.ssgm.fx.ifx.integration.beans;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

import java.util.List;

@Configuration(proxyBeanMethods = false)
//@ConditionalOnProperty(prefix = "fx.component.integration", name = "enable", havingValue = "true")
@ConditionalOnWebApplication
@Import({DbConfigure.class, Swagger2DocumentationConfiguration.class})
//@PropertySource("classpath:config.properties")
public class ComponentAutoConfigure {


    @Configuration(proxyBeanMethods = false)
    public class WebMvcAutoConfigure implements WebMvcConfigurer {

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            LoginInterceptor loginInterceptor = new LoginInterceptor();
            InterceptorRegistration loginInterceptorReg = registry.addInterceptor(loginInterceptor);
            loginInterceptorReg.addPathPatterns("/api/**");
            loginInterceptorReg.excludePathPatterns("/api/login", "/api/logout", "/api/toLogin", "/api/isLogin",
                    "/swagger-ui.html", "/swagger-resources/**", "/v2/api-docs", "/");

        }

        @Override
        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
            //MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        }

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            //registry.addResourceHandler("/config/**").addResourceLocations("classpath:/static/");
            registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        }

        @Bean
        InternalResourceViewResolver internalResourceViewResolver() {
            InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
            //internalResourceViewResolver.setPrefix();
            //internalResourceViewResolver.setSuffix("");
            return internalResourceViewResolver;
        }

    }

//    @Bean
//    public Module javaTimeModule() {
//        JavaTimeModule module = new JavaTimeModule();
//        module.addSerializer(Date.class, new CustomDateSerializer());
//        module.addDeserializer(Date.class, new CustomDateDeserializer());
//        //module.addSerializer(ConfigStatusEnum.class, new ConfigStatusSerializer());
//        return module;
//    }

    @Bean
    HandlerExceptionResolver customExceptionResolver() {
        return new GlobalHandlerExceptionResolver();
    }


}

