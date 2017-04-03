
import java.util.regex.Matcher;

import java.util.regex.Pattern;
public class Book extends BookApplication {
	 
	 private String name;
	 private String address;
	 private String phoneNumber;
	 private String emailAddress;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
		
	
	public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			isPhoneNumberValid(phoneNumber);

	    }
		
		
		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
			isEmailValid(emailAddress);

	    }
		
		
		
		private boolean isEmailValid(String email){  
	        boolean isValid = false;  

	        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
	        CharSequence inputStr = email;  
	        //Make the comparison case-insensitive.  
	        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
	        Matcher matcher = pattern.matcher(inputStr);  
	        if(matcher.matches()){  
	            isValid = true;  
	        }  
	        return isValid;  
	    } 
	    
	    private boolean isPhoneNumberValid(String phoneNumber){  
	        boolean isValid = false;  

	        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
	        CharSequence inputStr = phoneNumber;  
	        Pattern pattern = Pattern.compile(expression);  
	        Matcher matcher = pattern.matcher(inputStr);  
	        if(matcher.matches()){  
	            isValid = true;  
	        }  
	        return isValid;  
	    }  
		
		
		
		
		
		
	}



/*adding a note for gitHub commit
*/

/*adding a second note for giHub
 * 
 */






