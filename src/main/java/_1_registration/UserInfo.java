package _1_registration;


//This class is It returns the value of the attribute and takes a parameter and 
//assigns it to the attributes

public class UserInfo {
	public String fname = "";
	public String lname = "";
	public String id = "";
	public String email = "";
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;

	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
