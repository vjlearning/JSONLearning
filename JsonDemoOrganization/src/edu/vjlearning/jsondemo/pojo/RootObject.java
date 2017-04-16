/**
 * 
 */
package edu.vjlearning.jsondemo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vjlearning
 *
 */
public class RootObject {
	
	@JsonProperty("Organization")
	Organization organization;

	/**
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RootObject [organization=" + organization + "]";
	}
	
	

}
