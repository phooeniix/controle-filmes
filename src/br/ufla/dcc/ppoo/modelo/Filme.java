/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.modelo;

/**
 *
 * @author alexandre.carvalho
 */
public class Filme {
    private String name;
    private double duration;
    private int year;
    private String description;
    private String genre;
    private int cod = 0;
    
     public Filme(){    
     }
     public Filme(String name, double duration, int year,String description, String genre){
        this.cod = ++cod;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.name = name;
        this.year = year;
     }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

}
