package ironeko;

import java.io.Serializable;

public abstract class Ships implements Serializable {

    private String name;
    private String code;
    private String information;
    private double heavy;
    private double life;

    public Ships(String name, String code, String information, double heavy, double life) {
        this.name = name;
        this.code = code;
        this.information = information;
        this.heavy = heavy;
        this.life = life;
    }

    public Ships() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public double getHeavy() {
        return heavy;
    }

    public void setHeavy(double heavy) {
        this.heavy = heavy;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public abstract double damage();

    @Override
    public String toString() {
        return "Ships{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", information='" + information + '\'' +
                ", heavy=" + heavy +
                ", life=" + life +
                '}';
    }
}
