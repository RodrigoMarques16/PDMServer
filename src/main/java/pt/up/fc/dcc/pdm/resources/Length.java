package pt.up.fc.dcc.pdm.resources;

import java.io.Serializable;

/**
 * Length
 */
public class Length implements Serializable {
    
    private static final long serialVersionUID = 3620198866379968701L;

    private int hours;
    private int minutes;
    private int seconds;

    public Length(int h, int m, int s) {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }
}