package org.shilpa.java.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author shilpa
 * @implNote This class holds the metadata for the Container Entity
 */
@Entity
public class Container {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int containerNumber;
	private String containerISOCode;
	private int containerFullOrEmpty;
	private String containerType;
	private int width;
	private int length;
	private int height; 
	private int grossWeight;
	private String sealNUmber;
	private String isDGGoods;
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "demo_vessel_id")
	private Vessel vessels;
	
	//default constructor
	public Container() {
		super();
	}

	//parameterized constructor for creating the Container instance
	public Container(int containerNumber, String containerISOCode, int containerFullOrEmpty, String containerType,
			int width, int length, int height, int grossWeight, String sealNUmber, String isDGGoods, Vessel vessel) {
		super();
		this.containerNumber = containerNumber;
		this.containerISOCode = containerISOCode;
		this.containerFullOrEmpty = containerFullOrEmpty;
		this.containerType = containerType;
		this.width = width;
		this.length = length;
		this.height = height;
		this.grossWeight = grossWeight;
		this.sealNUmber = sealNUmber;
		this.isDGGoods = isDGGoods;
		this.vessels = vessel;
	}
	
	public int getId() {
		return id;
	}

	public int getContainerNumber() {
		return containerNumber;
	}

	public void setContainerNumber(int containerNumber) {
		this.containerNumber = containerNumber;
	}

	public String getContainerISOCode() {
		return containerISOCode;
	}

	public void setContainerISOCode(String containerISOCode) {
		this.containerISOCode = containerISOCode;
	}

	public int getContainerFullOrEmpty() {
		return containerFullOrEmpty;
	}

	public void setContainerFullOrEmpty(int containerFullOrEmpty) {
		this.containerFullOrEmpty = containerFullOrEmpty;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(int grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getSealNUmber() {
		return sealNUmber;
	}

	public void setSealNUmber(String sealNUmber) {
		this.sealNUmber = sealNUmber;
	}

	public String getIsDGGoods() {
		return isDGGoods;
	}

	public void setIsDGGoods(String isDGGoods) {
		this.isDGGoods = isDGGoods;
	}

	public Vessel getVessels() {
		return vessels;
	}

	public void setVessels(Vessel vessels) {
		this.vessels = vessels;
	}

}
