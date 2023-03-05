package com.javatechie.slfb.example.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatechie.slfb.example.service.PaymentRegistry;

@Configuration
public class ServiceLocatorConfig {

	@Bean("PaymentRegistry")
	public FactoryBean<?> getPaymentRegistry() {
		ServiceLocatorFactoryBean serviceLocatorFactoryBean = new ServiceLocatorFactoryBean();
		serviceLocatorFactoryBean.setServiceLocatorInterface(PaymentRegistry.class);
		return serviceLocatorFactoryBean;
	}

}
