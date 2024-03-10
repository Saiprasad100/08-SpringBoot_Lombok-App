package in.sai.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Person {
	
	private Integer personId;
	private String personName;
	private String gender;
	private Long phNumber;
	private Date dob;
	
}
