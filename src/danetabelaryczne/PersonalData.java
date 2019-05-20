/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package danetabelaryczne;

/**
 *
 * @author pieni
 */

public class PersonalData {
    
    private String FirstName;
    private String LastName;
    private int Salary;

    public PersonalData(String FirstName, String LastName, int Salary) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
}
