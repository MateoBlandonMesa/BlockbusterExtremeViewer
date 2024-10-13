/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusterextremeviewer.classes;

import java.time.LocalDate;

/**
 *
 * @author blandonm
 */
public class Rental {
    
    private String idRental;
    
    private Movie rentedMovie;
    
    private Customer rentCustomer;
    
    private LocalDate returnDate;
    
    private LocalDate rentalDate;
    
    private double totalCost;
    
    private boolean movieReturned;

    /**
     * Get the value of movieReturned
     *
     * @return the value of movieReturned
     */
    public boolean isMovieReturned() {
        return movieReturned;
    }

    /**
     * Set the value of movieReturned
     *
     * @param movieReturned new value of movieReturned
     */
    public void setMovieReturned(boolean movieReturned) {
        this.movieReturned = movieReturned;
    }


    /**
     * Get the value of totalCost
     *
     * @return the value of totalCost
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Set the value of totalCost
     *
     * @param totalCost new value of totalCost
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


    /**
     * Get the value of rentalDate
     *
     * @return the value of rentalDate
     */
    public LocalDate getRentalDate() {
        return rentalDate;
    }

    /**
     * Set the value of rentalDate
     *
     * @param rentalDate new value of rentalDate
     */
    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }


    /**
     * Get the value of returnDate
     *
     * @return the value of returnDate
     */
    public LocalDate getreturnDate() {
        return returnDate;
    }

    /**
     * Set the value of returnDate
     *
     * @param returnDate new value of returnDate
     */
    public void setreturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    /**
     * Get the value of rentCustomer
     *
     * @return the value of rentCustomer
     */
    public Customer getRentCustomer() {
        return rentCustomer;
    }

    /**
     * Set the value of rentCustomer
     *
     * @param rentCustomer new value of rentCustomer
     */
    public void setRentCustomer(Customer rentCustomer) {
        this.rentCustomer = rentCustomer;
    }


    /**
     * Get the value of rentedMovie
     *
     * @return the value of rentedMovie
     */
    public Movie getRentedMovie() {
        return rentedMovie;
    }

    /**
     * Set the value of rentedMovie
     *
     * @param rentedMovie new value of rentedMovie
     */
    public void setRentedMovie(Movie rentedMovie) {
        this.rentedMovie = rentedMovie;
    }


    /**
     * Get the value of idRental
     *
     * @return the value of idRental
     */
    public String getIdRental() {
        return idRental;
    }

    /**
     * Set the value of idRental
     *
     * @param idRental new value of idRental
     */
    public void setIdRental(String idRental) {
        this.idRental = idRental;
    }

}
