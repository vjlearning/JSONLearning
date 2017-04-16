/**
 * 
 */
package edu.vjlearning.jsondemo.pojo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vjlearning
 *
 */
public class Organization {
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("HeadOfficeCity")
	private String headOfficeCity;
	
	@JsonProperty("EmployeeCount")
	private int employeeCount;
	
	@JsonProperty("Employees")
	private List<Employee> employeeList;
	
	@JsonProperty("LocationCodes")
	private Map<String, String> locationCodeMap;
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
	 * @return the headOfficeCity
	 */
	public String getHeadOfficeCity() {
		return headOfficeCity;
	}
	/**
	 * @param headOfficeCity the headOfficeCity to set
	 */
	public void setHeadOfficeCity(String headOfficeCity) {
		this.headOfficeCity = headOfficeCity;
	}
	/**
	 * @return the employeeCount
	 */
	public int getEmployeeCount() {
		return employeeCount;
	}
	/**
	 * @param employeeCount the employeeCount to set
	 */
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	/**
	 * @return the employeeList
	 */
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	/**
	 * @return the locationCodeMap
	 */
	public Map<String, String> getLocationCodeMap() {
		return locationCodeMap;
	}
	/**
	 * @param locationCodeMap the locationCodeMap to set
	 */
	public void setLocationCodeMap(Map<String, String> locationCodeMap) {
		this.locationCodeMap = locationCodeMap;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Organization [name=" + name + ", headOfficeCity=" + headOfficeCity + ", employeeCount=" + employeeCount
				+ ", employeeList=" + employeeList + ", locationCodeMap=" + locationCodeMap + "]";
	}
	
}
