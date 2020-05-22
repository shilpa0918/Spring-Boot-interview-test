package org.shilpa.java.repository;

import java.util.List;

import org.shilpa.java.model.ShippingLine;

public interface ShippingLineRepository{
	public List<ShippingLine> findShippingLineByLineCode(int lineCode);
}
