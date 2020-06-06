package cn.lhzh.springboot04webrestfulcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Converter;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBoot04WebRestfulcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04WebRestfulcrudApplication.class, args);
	}
	@Bean
	public ViewResolver myViewResolver(){
		return new MyViewResolver();
	}


	private static class MyViewResolver implements ViewResolver{

		@Override
		public View resolveViewName(String s, Locale locale) throws Exception {
			return null;
		}
	}
	@Bean
	public Converter myConverter(){

		return new MyConverter();
	}

	public static class MyConverter implements Converter{

		@Override
		public Object convert(Object o, Class aClass, Object o1) {
			return null;
		}
	}


}
