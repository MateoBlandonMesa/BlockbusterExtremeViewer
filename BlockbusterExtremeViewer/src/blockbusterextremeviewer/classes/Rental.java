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

    public Rental() {
        this.id = null;
        this.idMovie = null;
        this.idCustomer = null;
        this.returnDate = null;
        this.rentalDate = null;
        this.totalCost = 0.00;
        this.movieReturned = false;
    }

    public Rental(String id, String idMovie, String idCustomer, LocalDate rentalDate, LocalDate returnDate, double totalCost, boolean movieReturned) {
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
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * Set the value of returnDate
     *
     * @param returnDate new value of returnDate
     */
    public void setReturnDate(LocalDate returnDate) {
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
                this.getReturnDate(), separatorCsv,
                this.getRentalDate(), separatorCsv,
                this.getTotalCost(), separatorCsv,
                this.isMovieReturned());
        return stringToSave;
    }

    @Override
    public IExportableToCsv parseCsvLineProperties(String[] properties) {
        LocalDate returnDateProperty;
        LocalDate rentalDateProperty;
        double totalCostProperty;
        boolean movieReturnedProperty;

        try {
            returnDateProperty = LocalDate.parse(properties[3]);
            rentalDateProperty = LocalDate.parse(properties[4]);
            totalCostProperty = Double.parseDouble(properties[5]);
            movieReturnedProperty = Boolean.parseBoolean(properties[6]);
        } catch (NumberFormatException ex) {
            System.err.println(String.format("Error parsing property: %s", ex.getMessage()));
            returnDateProperty = LocalDate.MIN;
            rentalDateProperty = LocalDate.MIN;
            totalCostProperty = 0.00;
            movieReturnedProperty = false;
        }

        this.setId(properties[0]);
        this.setIdMovie(properties[1]);
        this.setIdCustomer(properties[2]);
        this.setReturnDate(returnDateProperty);
        this.setRentalDate(rentalDateProperty);
        this.setTotalCost(totalCostProperty);
        this.setMovieReturned(movieReturnedProperty);

        return this;
    }

}
