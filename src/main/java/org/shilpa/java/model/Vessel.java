package org.shilpa.java.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author shilpa
 * @implNote This class holds the metadata for the Vessel Entity
 */
@Entity
public class Vessel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String vesselName;
	private int vesselCode;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ETA;
	
	public Date getETA() {
		return ETA;
	}

	public void setETA(Date eTA) {
		ETA = eTA;
	}

	public Date getVesselATADate() {
		return vesselATADate;
	}

	public void setVesselATADate(Date vesselATADate) {
		this.vesselATADate = vesselATADate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date vesselATADate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "demo_shippingline_id")
	private ShippingLine shippingLine;
	
	@OneToMany(mappedBy = "vessels", fetch = FetchType.EAGER)
	private Set<Container> containers;
	
	//default constructor
	public Vessel() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public Set<Container> getContainers() {
		return containers;
	}

	public void setContainers(Set<Container> containers) {
		this.containers = containers;
	}
	
	//parameterized constructor for creating Vessel instance
	public Vessel(String vesselName, int vesselCode, Date eTA, Date vesselATADate, ShippingLine shippingLine
		) {
		super();
		this.vesselName = vesselName;
		this.vesselCode = vesselCode;
		ETA = eTA;
		this.vesselATADate = vesselATADate;
		this.shippingLine = shippingLine;
	}

	
	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public int getVesselCode() {
		return vesselCode;
	}

	public void setVesselCode(int vesselCode) {
		this.vesselCode = vesselCode;
	}

	public ShippingLine getShippingLine() {
		return shippingLine;
	}

	public void setShippingLine(ShippingLine shippingLine) {
		this.shippingLine = shippingLine;
	}
}
