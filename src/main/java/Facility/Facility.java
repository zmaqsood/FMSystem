/**
 * 
 */
package Facility;

import java.util.ArrayList;

import Person.Address;
import Person.Person;

/**
 * @author Zain Maqsood
 *
 */
public class Facility implements IFacility, IFacilityUse{
	private String id = null;
	private String dimensions = null;
	private Address address;
	private ArrayList<Facility> capacity;
	private String detail = null;
	private ArrayList<Person> users;
	private ArrayList<String> inspection = new ArrayList<String>();
	
	public Facility(){
		//if no arguements passed set them as default
		this.dimensions = "1000 * 1000";
		this.address = null;
		this.capacity = new ArrayList<Facility> (5);
		users = new ArrayList<Person>(); 
	}
	
	public Facility(String id, String Dim, int Capacity, Address address){
		this.id = id;
		this.dimensions = Dim;
		this.address = address;
		this.capacity = new ArrayList<Facility>(Capacity);
	}

	public void listFacilities() {
		for (Facility f : capacity){
			System.out.println(f.id);
		}
	}

	public String getFacilityInfo() {
		return this.id + " " + this.address + " " + this.dimensions + " " + this.capacity.size() + " " + this.detail;
	}

	public int getAvailableCapacity() {
		return this.capacity.size();
	}

	public boolean addNewFacility(Facility f) {
		if (!this.capacity.contains(f.id)){
			this.capacity.add(f);
			return true;
			}
		else return false;
	}

	public void addFacilityDetail(String s) {
		this.detail = s;
	}

	public boolean removeFacility(Facility f) {
		if (!this.capacity.contains(f.id)){
			this.capacity.remove(f);
			return true;
			}
		else return false;
	}

	
	
	
	
	public boolean isInUseDuringInterval() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignFacilityToUse(Person p) {
		this.users.add(p);
		
	}

	public boolean vacateFacility() {
		this.users.clear();
		return true;
	}

	public void addInspection(String Inpection){
		this.inspection.add(Inpection);
	}
	public void listInspection() {
		for (String s : this.inspection){
			System.out.println(s);
		}
	}

	public void listActualUsage() {
		// TODO Auto-generated method stub
		
	}

	public double calcUsageRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}//end class
