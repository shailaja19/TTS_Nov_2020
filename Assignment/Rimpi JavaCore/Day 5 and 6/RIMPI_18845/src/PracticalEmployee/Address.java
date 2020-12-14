package PracticalEmployee;

// Creating address class having attribute Door Number, street, city, Pincode
public class Address{
	int DoorNo;
	String Street;
	String City;
	int pinCode;
	
	
	//generating getter and setter method
	public int getDoorNo() {
		return DoorNo;
	}
	public void setDoorNo(int doorNo) {
		DoorNo = doorNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	//to string 
	@Override
	public String toString() {
		return "Address [DoorNo=" + DoorNo + ", Street=" + Street + ", City=" + City + ", pinCode=" + pinCode + "]";
	}	

}