/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusterextremeviewer.classes;

import blockbusterextremeviewer.interfaces.IExportableToCsv;

/**
 *
 * @author blandonm
 */
public class Customer extends User implements IExportableToCsv {
    
    private String lastName;
    
    private String email;
    
    private int age;
    
    private String contactNumber;

    public Customer(String id, String name, String lastName, String email, int age, String contactNumber) {
        super(id, name);
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.contactNumber = contactNumber;
    }


    /**
     * Get the value of contactNumber
     *
     * @return the value of contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Set the value of contactNumber
     *
     * @param contactNumber new value of contactNumber
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Override
    public String toCsv(String separatorCsv) {
        return String.format("%s%s%s%s%s%s%s%s%s%s%s%s", 
                this.getId(), separatorCsv, 
                this.getName(), separatorCsv, 
                this.getLastName(), separatorCsv, 
                this.getEmail(), separatorCsv,
                this.getAge(), separatorCsv,
                this.getContactNumber(), separatorCsv);
    }

}
