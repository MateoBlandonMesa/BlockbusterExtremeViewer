/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusterextremeviewer.classes;

import blockbusterextremeviewer.interfaces.IDataStorage;
import blockbusterextremeviewer.interfaces.IExportableToCsv;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author blandonm
 */
public class Operation implements IDataStorage {
    
    private ArrayList<Movie> availableMovies;
    
    private ArrayList<Customer> customers;
    
    private ArrayList<Rental> rentals;
    
    private String separatorCsv;
    
    private String dataStorageFilePath;
    
    private String rootFolder;
    
    public Operation() {
        this.availableMovies = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentals = new ArrayList<>();
        this.separatorCsv = ";";
        this.rootFolder = new File("").getAbsolutePath();
        this.dataStorageFilePath = this.rootFolder + "/datastorage";
    }

    /**
     * Get the value of rootFolder
     *
     * @return the value of rootFolder
     */
    public String getRootFolder() {
        return rootFolder;
    }

    /**
     * Set the value of rootFolder
     *
     * @param rootFolder new value of rootFolder
     */
    public void setRootFolder(String rootFolder) {
        this.rootFolder = rootFolder;
    }


    /**
     * Get the value of dataStorageFilePath
     *
     * @return the value of dataStorageFilePath
     */
    public String getdataStorageFilePath() {
        return dataStorageFilePath;
    }

    /**
     * Set the value of dataStorageFilePath
     *
     * @param dataStorageFilePath new value of dataStorageFilePath
     */
    public void setdataStorageFilePath(String dataStorageFilePath) {
        this.dataStorageFilePath = dataStorageFilePath;
    }


    /**
     * Get the value of separatorCsv
     *
     * @return the value of separatorCsv
     */
    public String getSeparatorCsv() {
        return separatorCsv;
    }

    /**
     * Set the value of separatorCsv
     *
     * @param separatorCsv new value of separatorCsv
     */
    public void setSeparatorCsv(String separatorCsv) {
        this.separatorCsv = separatorCsv;
    }
    

    /**
     * Get the value of rentals
     *
     * @return the value of rentals
     */
    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    /**
     * Set the value of rentals
     *
     * @param rentals new value of rentals
     */
    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }


    /**
     * Get the value of customers
     *
     * @return the value of customers
     */
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    /**
     * Set the value of customers
     *
     * @param customers new value of customers
     */
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }


    /**
     * Get the value of availableMovies
     *
     * @return the value of availableMovies
     */
    public ArrayList<Movie> getAvailableMovies() {
        return availableMovies;
    }

    /**
     * Set the value of availableMovies
     *
     * @param availableMovies new value of availableMovies
     */
    public void setAvailableMovies(ArrayList<Movie> availableMovies) {
        this.availableMovies = availableMovies;
    }
    
    public void createCustomer(String name, String lastName, String email, int age, String contactNumber ){
        String id = UUID.randomUUID().toString();
        Customer newCustomer = new Customer(id, name, lastName, email, age, contactNumber);
        saveDataCsv(newCustomer, this.dataStorageFilePath, this.separatorCsv);
        this.customers.add(newCustomer);
        System.out.println(String.format("Customer created: %s %s (%s)", name, lastName, id));
    }

    @Override
    public void saveDataCsv(IExportableToCsv object, String dataStorageFilePath, String separatorCsv) {
        try {
            File file = new File(dataStorageFilePath);
            File folder = file.getParentFile();
            
            if (folder != null && !folder.exists()) {
                folder.mkdirs();
            }
            
            FileWriter writer = new FileWriter(dataStorageFilePath, true);
            writer.append(object.toCsv(separatorCsv)).append("\n");
            System.out.println(String.format("Data saved in %s", dataStorageFilePath));
        }
        catch (IOException ex) {
            System.err.println(String.format("Error saving data in %s: %s", dataStorageFilePath, ex.getMessage()));
        }
    }

}
