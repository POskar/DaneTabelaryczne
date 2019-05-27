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


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    @Override
    public void Serializuj(String plik) {
        try
        {
            FileOutputStream f1 = new FileOutputStream(plik);
            ObjectOutputStream o1 = new ObjectOutputStream(f1);
            o1.writeObject(students);
            o1.close();
            f1.close();
        }
        catch (Exception ex){}
    }

    @Override
    public void Deserializuj(String plik) {
        try
        {
            FileInputStream f1 = new FileInputStream(plik);
            ObjectInputStream o1 = new ObjectInputStream(f1);
            students = (ArrayList<PersonalData>) o1.readObject();
            o1.close();
            f1.close();
        }
        catch (Exception ex){}
    }
}

