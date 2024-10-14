/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blockbusterextremeviewer;

import blockbusterextremeviewer.classes.Operation;

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
        
        blockbusterOperation.createCustomer("Mateo", "Blandon", "mateo.blandon@udea.edu.co", 18, "3015149087");
        
        System.out.println("Operation finished!");
    }
    
}
