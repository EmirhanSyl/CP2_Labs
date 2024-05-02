package com.blackflower.thirdlab_cp2;

/**
 *
 * @author emirs
 */
public class Patient {
    int ID;
    String firstName;
    String LastName;
    Doctor DoktorID;
    int payment;

    public Patient(int ID, String firstName, String LastName, Doctor DoktorID, int payment) {
        this.ID = ID;
        this.firstName = firstName;
        this.LastName = LastName;
        this.DoktorID = DoktorID;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return firstName;
    }
    
    
}
