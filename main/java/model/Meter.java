package model;

import jakarta.persistence.*;

@Entity
@Table(name = "meters")
public class Meter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meter_id")
    private String meterId;
    @Column(name = "last_day_reading", nullable = false)
    private int lastDayReading;
    @Column(name = "last_night_reading", nullable = false)
    private int lastNightReading;
    public Meter() {
    }

    public Meter(int lastDayReading, int lastNightReading) {
        this.lastDayReading = lastDayReading;
        this.lastNightReading = lastNightReading;
    }

    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }


    public int getLastDayReading() {
        return lastDayReading;
    }

    public void setLastDayReading(int lastDayReading) {
        this.lastDayReading = lastDayReading;
    }

    public int getLastNightReading() {
        return lastNightReading;
    }

    public void setLastNightReading(int lastNightReading) {
        this.lastNightReading = lastNightReading;
    }

    @Override
    public String toString() {
        return "Meter{" +
                "meterId='" + meterId + '\'' +
                ", lastDayReading=" + lastDayReading +
                ", lastNightReading=" + lastNightReading +
                '}';
    }
}
