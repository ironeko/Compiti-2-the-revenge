package Ironeko;

import java.io.Serializable;

public class Destroyers extends Ships implements Serializable {

    private int rocketLauncher;
    private int submachineGun;
    private final int ROCKET_LAUNCHER_DAMAGE = 50;
    private final int SUBMACHINE_GUN_DAMAGE = 30;

    public Destroyers(String name, String code, String information, double heavy, double life, int rocketLauncher, int submachineGun) {
        super(name, code, information, heavy, life);
        this.rocketLauncher = rocketLauncher;
        this.submachineGun = submachineGun;
    }

    public Destroyers() {}

    public int getRocketLauncher() {
        return rocketLauncher;
    }

    public void setRocketLauncher(int rocketLauncher) {
        this.rocketLauncher = rocketLauncher;
    }

    public int getSubmachineGun() {
        return submachineGun;
    }

    public void setSubmachineGun(int submachineGun) {
        this.submachineGun = submachineGun;
    }

    public int getROCKET_LAUNCHER_DAMAGE() {
        return ROCKET_LAUNCHER_DAMAGE;
    }

    public int getSUBMACHINE_GUN_DAMAGE() {
        return SUBMACHINE_GUN_DAMAGE;
    }

    @Override
    public double damage() {
        return ROCKET_LAUNCHER_DAMAGE*rocketLauncher + SUBMACHINE_GUN_DAMAGE* submachineGun;
    }

    @Override
    public String toString() {
        return "Destroyers{" +
                "rocketLauncher=" + rocketLauncher +
                ", submachineGun=" + submachineGun +
                ", ROCKET_LAUNCHER_DAMAGE=" + ROCKET_LAUNCHER_DAMAGE +
                ", SUBMACHINE_GUN_DAMAGE=" + SUBMACHINE_GUN_DAMAGE +
                "} " + super.toString();
    }
}
