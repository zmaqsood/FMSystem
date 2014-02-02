/**
 * 
 */
package Person;

/**
 * @author Zain Maqsood
 *
 */
public class Phone {

	private String type = null;
	private String country = null;
	private String area = null;
	private String number = null;
	
	public Phone(){}
	
	public Phone (String Type, String Country, String Area, String Number){
		this.type = Type;
		this.country = Country;
		this.area = Area;
		this.number = Number;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String Type){
		this.type = Type;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	public void setCountry(String Country){
		this.country = Country;
	}
	
	public String getArea(){
		return this.area;
	}
	
	public void setArea(String Area){
		this.area = Area;
	}
	
	public String getNumber(){
		return this.number;
	}
	
	public void setNumber(String Number){
		this.number = Number;
	}
	
	public String getPhone(){
		return String.format("%s: +%s + (%s) + %s", type, country, area, number);
	}
	
}//end class
