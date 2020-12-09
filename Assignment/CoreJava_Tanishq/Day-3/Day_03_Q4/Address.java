package Day_03_Q4;

public class Address {

	int Door_no;
	String Street;
	String City;
	int Pincode;

	public int getDoor_no() {
		return Door_no;
	}

	public void setDoor_no(int door_no) {
		Door_no = door_no;
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

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [Door_no=" + Door_no + ", Street=" + Street + ", City=" + City + ", Pincode=" + Pincode + "]";
	}
	
	
}
