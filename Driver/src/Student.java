
public class Student extends Person {
 private final String status ;
 
 
 //subclass constructor with parameters
 
 public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
	 
	 super(name, address, phoneNumber, emailAddress);
	 this.status = status;
	 
	
	 
	 
 }


/**
 * @return the status
 */
public String getStatus() {
	return status;
}
 

 

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Student name:  " + getName() + "\n"+ "Address:  " + getAddress() + "\n" + "Phone Number:  " + getPhoneNumber() + "\n" + "Email Address:  "
			+ getEmailAddress() + "\n" + "Status:  " + status;
}







}
