/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blockbusterextremeviewer;

import blockbusterextremeviewer.classes.Customer;
import blockbusterextremeviewer.classes.Movie;
import blockbusterextremeviewer.classes.Operation;
import blockbusterextremeviewer.classes.Rental;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author blandonm
 */
public class BlockbusterExtremeViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operation blockbusterOperation = new Operation();
        
        //Load previous records
        ArrayList<Customer> customers = blockbusterOperation.getCustomers();
        ArrayList<Movie> movies = blockbusterOperation.getMovies();
        ArrayList<Rental> rentals = blockbusterOperation.getRentals();
        
        blockbusterOperation.createCustomer("12345678901", "Ernesto", "Pérez", "ernesto.perez@udea.edu.co", 18, "3015149087");
        blockbusterOperation.createMovie(6500.00, "Movie name", "Movie genre", 1997, "DVD", "Movie director", "Movie cast", "Movie language");
        blockbusterOperation.createRental("id Movie", "id customer", LocalDate.now(), LocalDate.now().plusDays(7), 4500.00, false);
        
        System.out.println("Operation finished!");
    }
    
}
