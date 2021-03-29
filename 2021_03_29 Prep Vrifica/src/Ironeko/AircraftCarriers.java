package Ironeko;

import java.io.Serializable;

public class AircraftCarriers extends Ships implements Serializable {

    private int aircraft;
    private final double DAMAGE_PER_AIRCRAFT = 100;

    public AircraftCarriers(String name, String code, String information, double heavy, double life, int aircraft) {
        super(name, code, information, heavy, life);
        this.aircraft = aircraft;
    }

    public AircraftCarriers(){}

    public int getAircraft() {
        return aircraft;
    }

    public void setAircraft(int aircraft) {
        this.aircraft = aircraft;
    }

    public double getDAMAGE_PER_AIRCRAFT() {
        return DAMAGE_PER_AIRCRAFT;
    }

    @Override
    public double damage() {
        return DAMAGE_PER_AIRCRAFT*aircraft;
    }

    @Override
    public String toString() {
        return "AircraftCarriers{" +
                "aircraft=" + aircraft +
                ", DAMAGE_PER_AIRCRAFT=" + DAMAGE_PER_AIRCRAFT +
                "} " + super.toString();
    }
}
