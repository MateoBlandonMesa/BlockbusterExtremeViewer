/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusterextremeviewer.classes;

import java.util.ArrayList;

/**
 *
 * @author blandonm
 */
public class Operation {
    
    private ArrayList<Movie> availableMovies;
    
    private ArrayList<Customer> customers;
    
    private ArrayList<Rental> rentals;

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

}
