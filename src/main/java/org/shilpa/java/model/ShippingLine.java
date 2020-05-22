package org.shilpa.java.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author shilpa
 * @implNote This class holds the metadata for the ShippingLine Entity
 */
@Entity
public class ShippingLine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String shippingLineName;
	private int lineCode;
	private String description;
	
	@OneToMany(mappedBy = "shippingLine", fetch = FetchType.EAGER)
	private Set<Vessel> vessels;
	
	//default constructor
	public ShippingLine() {
		super();
	}

	//parameterized constructor for creating ShippingLine instance
	public ShippingLine(String shippingLineName, int lineCode, String description) {
		super();
		this.shippingLineName = shippingLineName;
		this.lineCode = lineCode;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public String getShippingLineName() {
		return shippingLineName;
	}

	public void setShippingLineName(String shippingLineName) {
		this.shippingLineName = shippingLineName;
	}

	public int getLineCode() {
		return lineCode;
	}

	public void setLineCode(int lineCode) {
		this.lineCode = lineCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
