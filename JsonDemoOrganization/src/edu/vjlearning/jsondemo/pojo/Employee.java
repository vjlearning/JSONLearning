/**
 * 
 */
package edu.vjlearning.jsondemo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vjlearning
 *
 */
public class Employee {
	
	@JsonProperty("EmpName")
	private String name;
	
	@JsonProperty("EmpDesignation")
	private String designation;
	
	@JsonProperty("EmpWorkingLocation")
	private String officeLocationCode;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the officeLocationCode
	 */
	public String getOfficeLocationCode() {
		return officeLocationCode;
	}
	/**
	 * @param officeLocationCode the officeLocationCode to set
	 */
	public void setOfficeLocationCode(String officeLocationCode) {
		this.officeLocationCode = officeLocationCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", officeLocationCode=" + officeLocationCode
				+ "]";
	}
	
	
	
	

}
