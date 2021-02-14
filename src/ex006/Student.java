package ex006;

class Student {
    
    private String lastName = "";
    private String firstName = "";
    private int ID = 0;
    
    //create the constructor here
    public Student(String lastName, String firstName, int ID) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
	//create the accessors here
	public String getLastName() {
	    return this.lastName;
	}
	
	public String getFirstName() {
	    return this.firstName;
	}
	
	public int getID() {
	    return this.ID;
	}

}