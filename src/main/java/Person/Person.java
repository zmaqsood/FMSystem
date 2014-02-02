/**
 * 
 */
package Person;

import java.util.ArrayList;

/**
 * @author Zain Maqsood
 *
 */
public class Person {

	private String id = null;
	private String fname = null;
	private String middlename = null;
	private String lname = null;
	private String DOB = null;
	private ArrayList<Phone> phone = null;
	private ArrayList<Address>address = null;
	private String email = null;
	
	
	public Person(){
		this.address = new ArrayList<Address>();
		this.phone = new ArrayList<Phone>();
	}
	
	public Person(String id, String Fname, String Lname, String dob){
		this();
		this.id = id;
		this.fname = Fname;
		this.lname = Lname;
		this.DOB = dob;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getFirstName(){
		return this.fname;
	}
	
	public void setFirstName(String Fname){
		this.fname = Fname;
	}
	
	public String getLastName(){
		return this.lname;
	}
	
	public void setLastName(String Lname){
		this.lname = Lname;
	}
	
	public String getMiddleName(){
		return this.middlename;
	}
	
	public void setMiddleName(String mname){
		this.middlename = mname;
	}
	
	public String getFullName(){
		if (this.middlename != null)
			return this.fname + " " + this.middlename + " " + this.lname;
		else 
			return this.fname + " " + this.lname;
	}
	
	public ArrayList<Address> getAddress(){
		return this.address;
	}
	
	public void addAddress(Address address){
		this.address.add(address);
	}
	
	public boolean removeAddress(Address address){
		if (this.address.contains(address)){
			this.address.remove(address);
		}
		return !this.address.contains(address);
	}
	
	public ArrayList<Phone> getPhone(){
		return this.phone;
	}
	
	public void addPhone(Phone phone){
		this.phone.add(phone);
	}
	
	public boolean removePhone(Phone phone){
		if (this.phone.contains(phone)){
			this.phone.remove(phone);
		}
		return !this.phone.contains(phone);
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getDOB(){
		return this.DOB;
	}
	
	public void setDOB(String dob){
		this.DOB = dob;
	}
}//end class
	
