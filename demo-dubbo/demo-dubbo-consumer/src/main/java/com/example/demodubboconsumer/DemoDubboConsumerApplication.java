package com.example.demodubboconsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;

@SpringBootApplication
@EnableDubboConfiguration
public class DemoDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDubboConsumerApplication.class, args);
	}
}
