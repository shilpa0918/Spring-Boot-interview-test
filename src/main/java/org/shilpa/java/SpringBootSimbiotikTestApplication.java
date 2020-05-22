package org.shilpa.java;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.shilpa.java.model.Container;
import org.shilpa.java.model.ShippingLine;
import org.shilpa.java.model.Vessel;
import org.shilpa.java.service.ContainerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimbiotikTestApplication implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ContainerService containerService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimbiotikTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date eTA = sdf.parse("07-01-2019");
		Date vesselATADate = sdf.parse("20-01-2020");
		
		ShippingLine shippingLine = new ShippingLine("shipping Line", 123, "shipping line description");
		Vessel vessel = new Vessel("new Vessel", 22, eTA, vesselATADate, shippingLine);
		Container container = new Container(2, "ISO2019", 0, "import", 20, 20, 60, 80, "Seal12", "DGGood", vessel);
		containerService.save(container);
	}
}
