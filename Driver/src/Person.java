//Super class

public class Person {

	
	
	private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
	
/**
	 Default Constructor 
*/
	public Person() {
	   //super();
	}

    
/**
     * Constructor with parameters 
	 * @param name
	 * @param address
	 * @param phoneNumber
	 * @param emailAddress
	 */
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		//super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}


/**
 * @return the name
 */
public String getName() {
	return name;
}


/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}


/**
 * @return the address
 */
public String getAddress() {
	return address;
}


/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}


/**
 * @return the phoneNumber
 */
public String getPhoneNumber() {
	return phoneNumber;
}


/**
 * @param phoneNumber the phoneNumber to set
 */
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


/**
 * @return the emailAddress
 */
public String getEmailAddress() {
	return emailAddress;
}


/**
 * @param emailAddress the emailAddress to set
 */
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Person name:  " + name + "\n"+ "Address:  " + address + "\n" + "Phone Number:  " + phoneNumber + "\n" + "Email Address:  "
			+ emailAddress;
}

}
	
