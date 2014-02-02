/**
 * 
 */
package Facility;

import Person.Person;

/**
 * @author Zain Maqsood
 *
 */
public interface IFacilityUse {

	public boolean isInUseDuringInterval();
	public void assignFacilityToUse(Person p);
	public boolean vacateFacility();
	public void listInspection();
	public void listActualUsage();
	public double calcUsageRate();
}
