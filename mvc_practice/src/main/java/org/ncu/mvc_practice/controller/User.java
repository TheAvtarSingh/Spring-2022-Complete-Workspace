package org.ncu.mvc_practice.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import customValidation.AgeValidator;
import customValidation.UsernameValidator;



public class User {
	@UsernameValidator
private String userName;
	

	@NotEmpty(message="this field is required")
	@Size(min=16, max=16)
	@Pattern(regexp="^(0|[1-9][0-9]*)$")
	private String aadharId;
	
	@Email
	@NotEmpty(message="this field is required")
	private String email;
	

	@Pattern(regexp="^(0|[1-9][0-9]*)$")
	@Size(min=10, max=10)
	private String number;
	
	
//	@Past
//	@NotNull(message="this field is required")
//	@DateTimeFormat(pattern = "dd/MM/yyyy")
    private String dob;
	
	
	@NotEmpty(message="this field is required")
	private String state;
	private HashMap<String, String> stateOptions;
	
	
	public HashMap<String, String> getStateOptions() {
		return stateOptions;
	}
	public void setStateOptions(HashMap<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}

	private String gender;
	private ArrayList<String> genderOptions;
	
	@NotEmpty(message="this field is required")
	private String category;
	private ArrayList<String> categoryOptions;

	
	@NotEmpty(message="this field is required")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$")
	@Size(min=8,max=22)
private String pass;

public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ArrayList<String> getCategoryOptions() {
		return categoryOptions;
	}
	public void setCategoryOptions(ArrayList<String> categoryOptions) {
		this.categoryOptions = categoryOptions;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

/*
 * @Pattern(regexp="^(0|[1-9][0-9]*)$")
 * 
 * @Min(10)
 * 
 * @Max(200)
 */

@NotNull(message = "This field is required")
//@AgeValidator
private String age;

@NotNull(message = "This field is required")
private String address;



public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

public String getInstruction() {
	return address;
}
public void setInstruction(String instruction) {
	this.address = instruction;
}

public ArrayList<String> getLanguageOptions() {
	return categoryOptions;
}
public void setLanguageOptions(ArrayList<String> languageOptions) {
	this.categoryOptions = languageOptions;
}
public String getLanguage() {
	return category;
}
public void setLanguage(String language) {
	this.category = language;
}


public ArrayList<String> getGenderOptions() {
	return genderOptions;
}
public void setGenderOptions(ArrayList<String> genderOptions) {
	this.genderOptions = genderOptions;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

public User() {
	// TODO Auto-generated constructor stub
	/* Adding labels for radio buttons */
	genderOptions = new ArrayList<String>();
	genderOptions.add("Male");
	genderOptions.add("Female");
	
	File file = new File("E:\\Downloads","file.txt");
	categoryOptions = new ArrayList<String>();
    try {

    	System.out.println("File path is: "+file.getCanonicalPath());
		Scanner myReader = new Scanner(file);
		while (myReader.hasNext()) {
			String string = (String) myReader.next();
			categoryOptions.add(string);
		}
		myReader.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    stateOptions = new HashMap<String, String>();
	stateOptions.put("DL", "Delhi");
	stateOptions.put("HR", "Haryana");
	stateOptions.put("UP", "Uttar Pradesh");
	stateOptions.put("PB", "Punjab");
	stateOptions.put("MH", "Maharashtra");
	stateOptions.put("HP", "Himachal Pradesh");
	stateOptions.put("RJ", "Rajasthan");
	stateOptions.put("TN", "Tamil Nadu");
	stateOptions.put("KR", "Karnataka");
	stateOptions.put("AS", "Assam");
	stateOptions.put("MP", "Madhya Pradesh");
    
	/*
	 * languageOptions = new ArrayList<String>(); languageOptions.add("Java");
	 * languageOptions.add("C/C++"); languageOptions.add("C#");
	 * languageOptions.add("Python"); languageOptions.add("Javascript");
	 */
	 
	
}

}
