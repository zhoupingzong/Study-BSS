package com.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Configuration：将类标记为应用程序上下文的Bean定义的源。
 *
 * @EnableAutoConfiguration：告诉Spring Boot根据类路径设置，其他bean和各种属性设置开始添加bean。
 * 例如，如果spring-webmvc在类路径上，则此注释将应用程序标记为Web应用程序并激活关键行为，例如设置DispatcherServlet。
 *
 * @ComponentScan：告诉Spring在包中寻找其他组件，配置和服务com/example，让它找到控制器。
 */
@SpringBootApplication
public class StudyBbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyBbsApplication.class, args);
        /*该main()方法使用Spring Boot的SpringApplication.run()方法来启动应用程序*/
    }

}
