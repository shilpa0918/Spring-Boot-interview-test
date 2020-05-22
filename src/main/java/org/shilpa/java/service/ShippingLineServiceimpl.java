package org.shilpa.java.service;

import java.util.List;

import org.shilpa.java.model.ShippingLine;
import org.shilpa.java.repository.ShippingLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingLineServiceimpl implements ShippingLineService {

	@Autowired
	ShippingLineRepository repo;
	
	public List<ShippingLine> findShipLineByLineCode(int lineCode) {
		return repo.findShippingLineByLineCode(lineCode);
	}
}


