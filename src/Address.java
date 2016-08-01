
public class Address {
	protected String mStreet,mCity,mFloor,mApartmentNumber,mPostNumber,mCountry,mCountryCode;
	
	public Address(String city){
		mCity = city;
		mStreet = "Nema ulice";
		mFloor = "";
		mApartmentNumber = "";
		mPostNumber = "";
		mCountry = "Srbija";
		mCountryCode = "SRB";
	}
	
	public String getStreet(){
		return mStreet;
	}
	
	public void setStreet(String street){
		mStreet = street;
	}
	
	public String getCity(){
		return mCity;
	}
	
	public void setCity(String city){
		mCity = city;
	}
	
	public String getFloor(){
		return mFloor;
	}
	
	public void setFloor(String floor){
		mFloor = floor;
	}
	
	public String getApartmentNumber(){
		return mApartmentNumber;
	}
	
	public void setApartmentNumber(String apartmentNumber){
		mApartmentNumber = apartmentNumber;
	}
	
	public String getPostNumber(){
		return mPostNumber;
	}
	
	public void setPostNumber(String post){
		mPostNumber = post;
	}
	public String getCountry(){
		return mCountry;
	}
	
	public void setCountry(String country){
		mCountry = country;
	}
	
	public String getCountryCode(){
		return mCountryCode;
	}
	
	public void setCountryCode(String countryCode){
		mCountryCode = countryCode;
	}
	
	
}
