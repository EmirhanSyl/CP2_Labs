package com.mery.cp2_weekk_13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author emirs
 */
public class CP2_Weekk_13 {

    public static void main(String[] args) throws IOException {
        FileReader file;
        try {
            file = new FileReader("C:\\smth\\text.txt");
            int i = file.read();

            while (i != -1) {
                System.out.print((char) i);
                i = file.read();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\smth\\text.txt"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CP2_Weekk_13.class.getName()).log(Level.SEVERE, null, ex);
        }
        querySql();
    }

    public static void querySql() {

        ObjectInputStream ois = null;
        DataOutputStream dos = null;

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab");
            EntityManager entityManager = emf.createEntityManager();
            List<Employee> employees = entityManager.createNamedQuery("Employee.findAll", Employee.class).getResultList();
            List<Salaries> salaries = entityManager.createNamedQuery("Salaries.findAll", Salaries.class).getResultList();
            int i = 1;
            for (Employee employee : employees) {
                String fileName = "C:\\personel_" + i + ".object";
                i++;
                dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));

                dos.writeInt(employee.getId());

                for (Salaries salary : salaries) {
                    if (salary.getEmployeeId() == employee.getId()) {

                        dos.writeInt(salary.getMonthId());
                        dos.writeInt(salary.getAmount());
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CP2_Weekk_13.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CP2_Weekk_13.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(CP2_Weekk_13.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//
//    public static void ThirdQ() {
//        DataInputStream dos = null;
//
//        try {
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab");
//            EntityManager entityManager = emf.createEntityManager();
//            List<Employee> employees = entityManager.createNamedQuery("Employee.findAll", Employee.class).getResultList();
//            List<Salaries> salaries = entityManager.createNamedQuery("Salaries.findAll", Salaries.class).getResultList();
//
//            int i = 1;
//            for (Employee employee : employees) {
//                String fileName = "C:\\personel" + i + ".object";
//                dos = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
//                i++;
//                
//                
//
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(CP2_Weekk_13.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(CP2_Weekk_13.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                ois.close();
//            } catch (IOException ex) {
//                Logger.getLogger(CP2_Weekk_13.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }

}
