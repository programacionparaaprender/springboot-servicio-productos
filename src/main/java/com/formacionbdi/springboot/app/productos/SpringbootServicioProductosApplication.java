package com.formacionbdi.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
//@EntityScan({"com.formacionbdi.springboot.app.commons.models.entity"})
public class SpringbootServicioProductosApplication {

	public static void main(String[] args) {
		log.info("Funciona log4j");
		SpringApplication.run(SpringbootServicioProductosApplication.class, args);
	}

}
