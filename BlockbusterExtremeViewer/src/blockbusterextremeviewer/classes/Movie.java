/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbusterextremeviewer.classes;

import blockbusterextremeviewer.interfaces.IRentProduct;

/**
 *
 * @author blandonm
 */
public class Movie extends Product implements IRentProduct {
    
    private String title;
    
    private String genre;
    
    private int year;
        
    private String format;
    
    private String director;
    
    private String cast;
    
    private String language;

    /**
     * Get the value of language
     *
     * @return the value of language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Set the value of language
     *
     * @param language new value of language
     */
    public void setLanguage(String language) {
        this.language = language;
    }


    /**
     * Get the value of cast
     *
     * @return the value of cast
     */
    public String getCast() {
        return cast;
    }

    /**
     * Set the value of cast
     *
     * @param cast new value of cast
     */
    public void setCast(String cast) {
        this.cast = cast;
    }


    /**
     * Get the value of director
     *
     * @return the value of director
     */
    public String getDirector() {
        return director;
    }

    /**
     * Set the value of director
     *
     * @param director new value of director
     */
    public void setDirector(String director) {
        this.director = director;
    }


    /**
     * Get the value of format
     *
     * @return the value of format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Set the value of format
     *
     * @param format new value of format
     */
    public void setFormat(String format) {
        this.format = format;
    }


    /**
     * Get the value of year
     *
     * @return the value of year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the value of year
     *
     * @param year new value of year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Get the value of genre
     *
     * @return the value of genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Set the value of genre
     *
     * @param genre new value of genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }


    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void toRent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
