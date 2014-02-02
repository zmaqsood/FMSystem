/**
 * 
 */
package Facility;

import java.util.ArrayList;

/**
 * @author Zain Maqsood
 *
 */
public interface IFacility {

	public void listFacilities();
	public String getFacilityInfo();
	public int getAvailableCapacity();
	public boolean addNewFacility(Facility f);
	public void addFacilityDetail(String s);
	public boolean removeFacility(Facility f);
	
}
