/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blockbusterextremeviewer.interfaces;

/**
 *
 * @author blandonm
 */
public interface IExportableToCsv {
    
    String toCsv(String separatorCsv);
    
    IExportableToCsv parseCsvLineProperties(String[] properties);
}
