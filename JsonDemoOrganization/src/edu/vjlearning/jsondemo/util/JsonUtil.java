/**
 * 
 */
package edu.vjlearning.jsondemo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.vjlearning.jsondemo.pojo.Organization;

/**
 * @author vjlearning
 *
 */
public class JsonUtil {
	
	
	public static String getJsonStringFromObject(Object root) throws JsonProcessingException{
		
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(root);
	}

}
