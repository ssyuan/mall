package com.macro.mall.portal.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API文档的配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.macro.mall.portal.controller"))
                .paths(Predicates.or(PathSelectors.ant("/cart/*"),
                        PathSelectors.ant("/order/*"),
                        PathSelectors.ant("/sso/*"),
                        PathSelectors.ant("/member/address/*")
                       ))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("mall前台系统")
                .description("mall前台系统")
                .contact(new Contact("逆旅行人", "http://lf.com", "ssyuan@gmail.com"))
                .version("1.0")
                .build();
    }
}
