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


import java.util.ArrayList;

public class DataAccess implements IDataAccess{
    
    ArrayList<PersonalData> students = new ArrayList<>();

    public DataAccess() {
    }
    
    @Override
    public PersonalData Get(int index) {
        return students.get(index);
    }

    @Override
    public void Add(PersonalData student) {
        students.add(student);
    }
    
     @Override
    public void Remove(int index) {
        students.remove(index);
    }
    
    @Override
    public int Size() {
        return students.size();
    }
}

