
public class Faculty extends Employee {

	private String officeHours;
	private String rank;
	
	
	/**
	 * @return the officeHours
	 */
	public String getOfficeHours() {
		return officeHours;
	}
	/**
	 * @param officeHours the officeHours to set
	 */
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Faculty [officeHours=" + officeHours + ", rank=" + rank + "]";
	}
	
	
	
	
	
}
