package ex012;

public class Person {

	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	

	public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getBirthMonth() {
		return birthMonth;
	}


	public void setBirthMonth(int birthMonth) {
		if ((birthMonth >= 1) && (birthMonth <= 12)) {
			this.birthMonth = birthMonth;
		}
	}


	public int getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(int birthDay) {
		if (birthDay >= 1 && (birthDay <= 31)) {
			this.birthDay = birthDay;
		}
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	public String getBirthday() {
		return String.format("%d/%d/%d", this.birthMonth, this.birthDay, this.birthYear);
	}
	
	
}
