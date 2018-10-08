
import java.io.Serializable;
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class Measurement implements Serializable{
    private LocalDateTime dateTime;
    private String kennzeichen;
    private int gemessen;
    private int erlaubt;
    private int übertretung;

    public Measurement(LocalDateTime dateTime, String kennzeichen, int gemessen, int erlaubt) {
        this.dateTime = dateTime;
        this.kennzeichen = kennzeichen;
        this.gemessen = gemessen;
        this.erlaubt = erlaubt;
        this.übertretung=gemessen-erlaubt;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getGemessen() {
        return gemessen;
    }

    public int getErlaubt() {
        return erlaubt;
    }

    public int getÜbertretung() {
        return übertretung;
    }
    
    
    
    
}
