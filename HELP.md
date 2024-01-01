# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

SpringBoot中文翻译文档地址: https://felord.cn/_doc/_springboot/2.1.5.RELEASE/_book/index.html
thymeleaf中文网站：https://raledong.gitbooks.io/using-thymeleaf/content/

配置文件优先级：
file:./config 项目config目录下
file:./ 项目下
classpath:./config 
classpath:./

注解：记录元数据
元注解：
@Target 用来描述注解的使用范围（在什么地方可以使用）
@Retention 描述注解的生命周期。都在什么阶段保存注解的信息。
@Documented 该注解在javadoc中显示。
@Inherited 子类可以继承负类中的该注解。

Spring注解
@ConfigurationProperties 批量注入配置
@Value 单个注入配置


反射：

集成servlet
增加扫描Servlet注解 @ServletComponentScan
com.example.springbootstudy.controller.servlet.MyServlet
@Bean
public ServletRegistrationBean<TestServlet> getServletRegistrationBean() {
ServletRegistrationBean<TestServlet> bean = new ServletRegistrationBean<>(new TestServlet());
bean.setLoadOnStartup(1);
return bean;
}

https://git.mashibing.com/msb-mca/InternetArchitect
