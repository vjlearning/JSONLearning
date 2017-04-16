/**
 * 
 */
package edu.vjleaning.jsondemo.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.vjleaning.jsondemo.pojo.Person;

/**
 * @author vjlearning
 *
 */
public class JSONDemoImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File inputJsonFile = new File("person.json");
		
		try {
			//Convert JSON string into person Object
			Person person = new ObjectMapper().readValue(inputJsonFile, Person.class);
			
			System.out.println(person);
			
			//Convert person object into json String
			String jsonString = new ObjectMapper().writeValueAsString(person);
			
			System.out.println(jsonString);
			
		}
		catch(JsonParseException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
