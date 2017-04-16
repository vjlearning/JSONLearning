/**
 * 
 */
package edu.vjlearning.jsondemo.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.vjlearning.jsondemo.pojo.Employee;
import edu.vjlearning.jsondemo.pojo.Organization;
import edu.vjlearning.jsondemo.pojo.RootObject;
import edu.vjlearning.jsondemo.util.JsonUtil;

/**
 * @author vjlearning
 *
 */
public class Main {
	
	private static Organization abcOrg;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		buildAbcOrganization();
		
		RootObject root = new RootObject();
		root.setOrganization(abcOrg);
		
		try {
			
			String parsedJsonString = JsonUtil.getJsonStringFromObject(root);
			 
			System.out.println(new JSONObject(parsedJsonString).toString(5));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		File inputJsonFile = new File("Request.json");
		
		try {
			RootObject rootObject = new ObjectMapper().readValue(inputJsonFile, RootObject.class);
			
			System.out.println(rootObject);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void buildAbcOrganization(){
		
		//build Organization Object
				abcOrg = new Organization();
				abcOrg.setName("ABC Organization");
				abcOrg.setHeadOfficeCity("Bengaluru, India");
				abcOrg.setEmployeeCount(4);
				
				//Create and Add Employees 
				Employee firstEmployee = new Employee();
				firstEmployee.setName("Abhishek");
				firstEmployee.setDesignation("Team Lead");
				firstEmployee.setOfficeLocationCode("IN");
				
				Employee secondEmployee = new Employee();
				secondEmployee.setName("Rajesh");
				secondEmployee.setDesignation("Performace Team Lead");
				secondEmployee.setOfficeLocationCode("CA");
				
				Employee thirdEmployee = new Employee();
				thirdEmployee.setName("Prashant");
				thirdEmployee.setDesignation("Project Manager");
				thirdEmployee.setOfficeLocationCode("US");
				
				Employee fourthEmployee = new Employee();
				fourthEmployee.setName("Ashok");
				fourthEmployee.setDesignation("Database Administrator");
				fourthEmployee.setOfficeLocationCode("IN");
				
				List<Employee> employeeList = new ArrayList<Employee>();
				employeeList.add(firstEmployee);
				employeeList.add(secondEmployee);
				employeeList.add(thirdEmployee);
				employeeList.add(fourthEmployee);
				
				//Creating Location Codes
				
				Map<String, String> locationCodeMap = new HashMap<String, String>();
				locationCodeMap.put("IN", "India");
				locationCodeMap.put("CA", "Canada");
				locationCodeMap.put("US", "United States");
				locationCodeMap.put("UK", "United Kingdom");
				
				abcOrg.setLocationCodeMap(locationCodeMap);
				abcOrg.setEmployeeList(employeeList);
		
	}
	

}
