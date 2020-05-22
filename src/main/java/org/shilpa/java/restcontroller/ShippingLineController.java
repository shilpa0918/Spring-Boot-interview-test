package org.shilpa.java.restcontroller;

import java.util.List;

import org.shilpa.java.exception.ApplicationException;
import org.shilpa.java.model.ShippingLine;
import org.shilpa.java.service.ShippingLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingLineController {

	@Autowired
	ShippingLineService service;
	
	@GetMapping("/api/v1/shipLineCode/{lineCode}")
	public List<ShippingLine> findShipLineByLineCode(@PathVariable("lineCode") int lineCode) throws ApplicationException {
		List<ShippingLine> shipLines =service.findShipLineByLineCode(lineCode);
		if(shipLines.isEmpty())throw new ApplicationException();
		else return shipLines;
	}
}

 