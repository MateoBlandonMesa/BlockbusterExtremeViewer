/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blockbusterextremeviewer.interfaces;

import java.time.LocalDate;

/**
 *
 * @author blandonm
 */
public interface IOperation {

    void createCustomer(String id, String name, String lastName, String email, int age, String contactNumber);

    void createMovie(double price, String title, String genre, int year, String format, String director, String cast, String language);

    void createRental(String idMovie, String idCustomer, LocalDate returnDate, LocalDate rentalDate, double totalCost, boolean movieReturned);
    
}
