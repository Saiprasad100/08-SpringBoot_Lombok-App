package in.sai;

import in.sai.dto.Person;

public class Test {

	public static void main(String[] args) {
	Person p=new Person();
	
	p.setPersonId(101);
	
	System.out.println(p.getPersonId());
	
	System.out.println(p);	//Print to string
		
	}
}
