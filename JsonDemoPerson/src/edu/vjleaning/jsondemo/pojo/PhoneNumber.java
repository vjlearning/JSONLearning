/**
 * 
 */
package edu.vjleaning.jsondemo.pojo;

/**
 * @author vjlearning
 *
 */
public class PhoneNumber {
	
	private String type;
	private String number;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PhoneNumber [type=" + type + ", number=" + number + "]";
	}
	
	

}
