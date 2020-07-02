package org.sid.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
public void addCorsMapping(CorsRegistry registry) {
	registry.addMapping("/backlog").allowedMethods("GET","POST","PUT").allowedHeaders("*");
}
}
