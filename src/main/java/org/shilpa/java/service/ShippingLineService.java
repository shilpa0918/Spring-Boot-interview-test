package org.shilpa.java.service;

import java.util.List;

import org.shilpa.java.model.ShippingLine;

public interface ShippingLineService {
	public List<ShippingLine> findShipLineByLineCode(int lineCode);
}
