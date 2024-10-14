/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusterextremeviewer.classes;

import blockbusterextremeviewer.interfaces.IDataStorage;
import blockbusterextremeviewer.interfaces.IExportableToCsv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author blandonm
 */
public class Operation implements IDataStorage {
    
    private ArrayList<Movie> movies;
    
    private ArrayList<Customer> customers;
    
    private ArrayList<Rental> rentals;
    
    private String separatorCsv;
    
    private String customersTableFilePath;
    
    private String rootFolder;
    
    private String moviesTableFilePath;
    
    private String rentalsTableFilePath;
    
    
    
    public Operation() {
        this.movies = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentals = new ArrayList<>();
        this.separatorCsv = ";";
        this.rootFolder = new File("").getAbsolutePath();
        this.customersTableFilePath = this.rootFolder + "/datastorage/customersTable.csv";
        this.moviesTableFilePath = this.rootFolder + "/datastorage/moviesTable.csv";
        this.rentalsTableFilePath = this.rootFolder + "/datastorage/rentalsTable.csv";
        
    }

    /**
     * Get the value of rentalsTableFilePath
     *
     * @return the value of rentalsTableFilePath
     */
    public String getRentalsTableFilePath() {
        return rentalsTableFilePath;
    }

    /**
     * Set the value of rentalsTableFilePath
     *
     * @param rentalsTableFilePath new value of rentalsTableFilePath
     */
    public void setRentalsTableFilePath(String rentalsTableFilePath) {
        this.rentalsTableFilePath = rentalsTableFilePath;
    }


    /**
     * Get the value of moviesTableFilePath
     *
     * @return the value of moviesTableFilePath
     */
    public String getMoviesTableFilePath() {
        return moviesTableFilePath;
    }

    /**
     * Set the value of moviesTableFilePath
     *
     * @param moviesTableFilePath new value of moviesTableFilePath
     */
    public void setMoviesTableFilePath(String moviesTableFilePath) {
        this.moviesTableFilePath = moviesTableFilePath;
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
     * Get the value of customersTableFilePath
     *
     * @return the value of customersTableFilePath
     */
    public String getCustomersTableFilePath() {
        return customersTableFilePath;
    }

    /**
     * Set the value of customersTableFilePath
     *
     * @param customersTableFilePath new value of customersTableFilePath
     */
    public void setCustomersTableFilePath(String customersTableFilePath) {
        this.customersTableFilePath = customersTableFilePath;
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
     * Get the value of movies
     *
     * @return the value of movies
     */
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    /**
     * Set the value of movies
     *
     * @param movies new value of movies
     */
    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    
    public void createCustomer(String id, String name, String lastName, String email, int age, String contactNumber ){
        Customer newCustomer = new Customer(id, name, lastName, email, age, contactNumber);
        saveDataCsv(newCustomer, this.customersTableFilePath, this.separatorCsv);
        this.customers.add(newCustomer);
        System.out.println(String.format("Customer created: %s %s (%s)", name, lastName, id));
    }
    
    public void createMovie(double price, String title, String genre, int year, String format, String director, String cast, String language){
        String id = UUID.randomUUID().toString();
        Movie newMovie = new Movie(id, price, title, genre, year, format, director, cast, language);
        saveDataCsv(newMovie, this.moviesTableFilePath, this.separatorCsv);
        this.movies.add(newMovie);
        System.out.println(String.format("Movie created: %s %s (%s)", title, genre, id));
    }
    
    public void createRental(String idMovie, String idCustomer, LocalDate returnDate, LocalDate rentalDate, double totalCost, boolean movieReturned){
        String id = UUID.randomUUID().toString();
        Rental newRental = new Rental(id, idMovie, idCustomer, returnDate, rentalDate, totalCost, movieReturned);
        saveDataCsv(newRental, this.rentalsTableFilePath, this.separatorCsv);
        this.rentals.add(newRental);
        System.out.println(String.format("Rental created: %s %s (%s)", idMovie, idCustomer, id));
    }

    @Override
    public void saveDataCsv(IExportableToCsv object, String dataStorageFilePath, String separatorCsv) {
        File file = new File(dataStorageFilePath);
        File folder = file.getParentFile();
            
        if (folder != null && !folder.exists()) {
            folder.mkdirs();
        }
        try (FileWriter writer = new FileWriter(dataStorageFilePath, true)) {
            String stringToSave = object.toCsv(separatorCsv);
            writer.append(stringToSave).append("\n");
            System.out.println(String.format("Data saved in %s", dataStorageFilePath));
        }
        catch (IOException ex) {
            System.err.println(String.format("Error saving data in %s: %s", dataStorageFilePath, ex.getMessage()));
        }
    }

    @Override
    public <T extends IExportableToCsv> ArrayList<T> loadDataCsv(String dataStorageFilePath, String separatorCsv, Class<T> objectClass) {
        ArrayList<T> dataList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(dataStorageFilePath))){
            String line;
            while ((line = br.readLine()) != null){
                String[] properties = line.split(separatorCsv);
                T object = parseCsvLine(properties, objectClass);
                dataList.add(object);
            }
        }
        catch (IOException ex) {
            System.err.println(String.format("Error loading data in %s: %s", dataStorageFilePath, ex.getMessage()));
        }
        
        return dataList;
    }

    private <T extends IExportableToCsv> T parseCsvLine(String[] fields, Class<T> objectClass) {
        if (objectClass.equals(Customer.class)) {
            Customer auxCustomer = new Customer();
            auxCustomer.parseCsvLineProperties(fields);
            return (T) auxCustomer;
        } else if (objectClass.equals(Movie.class)) {
            Movie auxMovie = new Movie();
            auxMovie.parseCsvLineProperties(fields);
            return (T) auxMovie;
        } else if (objectClass.equals(Rental.class)) {
            Rental auxRental = new Rental();
            auxRental.parseCsvLineProperties(fields);
            return (T) auxRental;
        }
        else{
            throw new IllegalArgumentException("Unknown class type: " + objectClass);
        }
    }

}
