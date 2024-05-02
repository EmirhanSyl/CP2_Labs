
package com.blackflower.thirdlab_cp2;

/**
 *
 * @author emirs
 */
public class Doctor {
    String doctorName;
    int fee;

    public Doctor(String doctorName, int fee) {
        this.doctorName = doctorName;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return doctorName + " || Fee: " + fee;
    }
    
    
}
