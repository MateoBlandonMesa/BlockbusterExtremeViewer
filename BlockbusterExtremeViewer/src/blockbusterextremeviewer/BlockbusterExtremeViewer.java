/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blockbusterextremeviewer;

import blockbusterextremeviewer.classes.Operation;
import java.time.LocalDate;

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
        
        blockbusterOperation.createCustomer("1010100102", "Mateo", "Blandon", "mateo.blandon@udea.edu.co", 18, "3015149087");
        blockbusterOperation.createMovie(4500.00, "Men in Black", "SciFy-Comedy", 1997, "DVD", "Barry Sonnenfeld", "Will Smith", "English");
        blockbusterOperation.createRental("id Men in Black", "1010100102", LocalDate.now(), LocalDate.now().plusDays(7), 4500.00, false);
        
        System.out.println("Operation finished!");
    }
    
}
