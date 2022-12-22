/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author user
 */
public class Phonebook implements CRUD_Interface {

    public static void main(String[] args) {
        //Initialize Data Structure
        CRUD_Interface.DB_Initialize();
        //Insert Sample Data
        System.out.println("Adding Sample Data");
        CRUD_Interface.addRow("Maicah", "Lalaguna", "08/19/2001", "Balete", "1820031@ub.edu.ph", "09293285725");
        //Initialize GUI
        LalagunaF app = new LalagunaF();
        app.setVisible(true);
        System.out.println("Hello World!");
        
        
    }
}
