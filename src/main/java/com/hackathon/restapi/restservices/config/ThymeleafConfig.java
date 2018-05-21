package com.hackathon.restapi.restservices.config;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
public class ThymeleafConfig {
private static final String ENCODING = "UTF-8";
	
	@Bean 
	public ServletContextTemplateResolver templateResolver(ServletContext servletContext) {
		ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(servletContext);
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		resolver.setTemplateMode("HTML5");
		resolver.setOrder(1);
		return resolver;
	}
	
	/*@Bean 
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.setTemplateResolver(templateResolver());
		Set<IDialect> dialects = new HashSet<IDialect>();
		dialects.add(springSecurityDialect());
		engine.setAdditionalDialects(dialects);
		return engine;
	}*/
	
	/*@Bean 
	public ThymeleafViewResolver thymeleafViewResolver() {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setCharacterEncoding(ENCODING);
		resolver.setTemplateEngine(templateEngine());
		//resolver.setTemplateEngine(templateEngine());
		return resolver;
	}*/
	
	/*@Bean
    public SpringSecurityDialect springSecurityDialect(){
        SpringSecurityDialect dialect = new SpringSecurityDialect();
        return dialect;
    }*/
	
/*	@Bean
	public MultipartResolver multipartResolver() {
	    MultipartResolver resolver=new CommonsMultipartResolver();
	    //resolver.setDefaultEncoding("utf-8");
	    return resolver;
	}*/
}
