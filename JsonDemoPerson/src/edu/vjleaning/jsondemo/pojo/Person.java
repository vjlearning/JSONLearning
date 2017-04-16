/**
 * 
 */
package edu.vjleaning.jsondemo.pojo;

import java.util.List;

/**
 * @author vjlearning
 *
 */
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	private List<PhoneNumber> phoneNumbers;
	private Gender gender;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the phoneNumbers
	 */
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ ", phoneNumbers=" + phoneNumbers + ", gender=" + gender + "]";
	}
	
	

}
