/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusterextremeviewer.classes;

import blockbusterextremeviewer.interfaces.IExportableToCsv;
import java.time.LocalDate;

/**
 *
 * @author blandonm
 */
public class Rental implements IExportableToCsv {
    
    private String id;
    
    private String idMovie;
    
    private String idCustomer;
    
    private LocalDate returnDate;
    
    private LocalDate rentalDate;
    
    private double totalCost;
    
    private boolean movieReturned;

    public Rental(String id, String idMovie, String idCustomer, LocalDate returnDate, LocalDate rentalDate, double totalCost, boolean movieReturned) {
        this.id = id;
        this.idMovie = idMovie;
        this.idCustomer = idCustomer;
        this.returnDate = returnDate;
        this.rentalDate = rentalDate;
        this.totalCost = totalCost;
        this.movieReturned = movieReturned;
    }
    

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
     * Get the value of idCustomer
     *
     * @return the value of idCustomer
     */
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * Set the value of idCustomer
     *
     * @param idCustomer new value of idCustomer
     */
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }


    /**
     * Get the value of idMovie
     *
     * @return the value of idMovie
     */
    public String getIdMovie() {
        return idMovie;
    }

    /**
     * Set the value of idMovie
     *
     * @param idMovie new value of idMovie
     */
    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toCsv(String separatorCsv) {
        String stringToSave = String.format("%s%s%s%s%s%s%s%s%s%s%s%s%s", 
                this.getId(), separatorCsv,
                this.getIdMovie(), separatorCsv,
                this.getIdCustomer(), separatorCsv, 
                this.getreturnDate(), separatorCsv,
                this.getRentalDate(), separatorCsv,
                this.getTotalCost(), separatorCsv,
                this.isMovieReturned());
        return stringToSave;
    }

}
