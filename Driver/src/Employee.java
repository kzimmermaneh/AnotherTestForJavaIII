/**
 * 
 */

/**
 * @author kellyzimmermanpa
 * Subclass of Person
 */
public class Employee extends Person {
    private int officeNumber;
    private int salary;
    private MyDate dateHired;
    

    
 //constructor with parameters
    
    public Employee(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired) {
    	
    	super(name, address, phoneNumber, emailAddress);
    	this.officeNumber = officeNumber;
    	this.salary = salary;
    	this.dateHired = dateHired;
  	
    }

    public Employee (){
    	
    }
    
    
    
    
    
	/**
	 * @return the officeNumber
	 */
	public int getOfficeNumber() {
		return officeNumber;
	}


	/**
	 * @param officeNumber the officeNumber to set
	 */
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}


	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}


	/**
	 * @return the dateHired
	 */
	public MyDate getDateHired() {
		return dateHired;
	}


	/**
	 * @param dateHired the dateHired to set
	 */
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
    
    
    

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee name:  " + getName() + "\n"+ "Address:  " + getAddress() + "\n" + "Phone Number:  " + getPhoneNumber() + "\n" + "Email Address:  "
			+ getEmailAddress() + "\n" + "Office Number:  " +   getOfficeNumber() + "\n" + "Salary:  " + getSalary() +  "Date Hired:  " + getDateHired();
}

    
    
    
    
    
    
}
