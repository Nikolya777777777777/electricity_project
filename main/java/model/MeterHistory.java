package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "meter_history")
public class MeterHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "meter_id", nullable = false)
    private String meterId;
    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime date;
    @Column(name = "day_reading", nullable = false)
    private int dayReading;
    @Column(name = "night_reading", nullable = false)
    private int nightReading;

    public MeterHistory() {
    }

    public MeterHistory(Meter meter) {
        this.meterId = meter.getMeterId();
        this.dayReading = meter.getLastDayReading();
        this.nightReading = meter.getLastNightReading();
    }

    public MeterHistory(Long id, String meterId, LocalDateTime date, int dayReading, int nightReading) {
        this.id = id;
        this.meterId = meterId;
        this.date = date;
        this.dayReading = dayReading;
        this.nightReading = nightReading;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getDayReading() {
        return dayReading;
    }

    public void setDayReading(int dayReading) {
        this.dayReading = dayReading;
    }

    public int getNightReading() {
        return nightReading;
    }

    public void setNightReading(int nightReading) {
        this.nightReading = nightReading;
    }
}
