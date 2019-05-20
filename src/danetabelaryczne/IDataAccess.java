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
public interface IDataAccess {
    
    PersonalData Get(int index);
    
    void Add(PersonalData student);
    
    void Remove(int index);
    
    int Size();
}

