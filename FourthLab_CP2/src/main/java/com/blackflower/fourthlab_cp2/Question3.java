package com.blackflower.fourthlab_cp2;

/**
 *
 * @author emirs
 */
public class Question3 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Employee e0 = new Employee(10000);
        employees[0] = e0;
        employees[1] = null;
        Employee e2 = new Employee(10000);
        employees[0] = e2;
        int sum = 0;
        for (int i=0; i < employees.length; i++) {
            try {
                sum += employees[i].salary;
            } catch (Exception e) {
                System.out.println("Empity");
            }
        }
        System.out.println(sum + "");
    }
}
