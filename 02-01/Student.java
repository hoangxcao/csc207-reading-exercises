

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int age;

    /**
     * Gets the first name of the student.
     * 
     * @param 
     * @return returns the first name of the student
     */
    public String getFirstName() {
        return this.firstName;
    }
    
    /**
     * Gets the last name of the student.
     * 
     * @param 
     * @return returns the last name of the student
     */
    public String getLastName() {
        return this.lastName;
    }
    
    /**
     * Gets the ID of the student.
     * 
     * @param 
     * @return returns the ID of the student
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Gets the age of the student.
     * 
     * @param 
     * @return returns the age of the student
     */
    public int getAge() {
        return this.age;
    }
    
    /**
     * Sets the first name of the student.
     * @param firstname the new first name set for the student.
     */
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    
    /**
     * Sets the last name of the student.
     * @param lastname the new last name set for the student.
     */
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
    
    /**
     * Sets the ID of the student.
     * @param id the new id value set for the student.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Sets the age of the student.
     * @param age the new age value set for the student.
     */
    public void setAge(int age) {
        this.age = age;
    }
}
