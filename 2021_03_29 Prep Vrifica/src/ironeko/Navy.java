package ironeko;

import java.io.Serializable;
import java.util.ArrayList;

public class Navy implements Serializable {

    private ArrayList<Ships> navy = new ArrayList<>();

    public Navy(ArrayList<Ships> navy) {
        this.navy = navy;
    }

    public Navy(){}

    public ArrayList<Ships> getNavy() {
        return navy;
    }

    public void setNavy(ArrayList<Ships> navy) {
        this.navy = navy;
    }

    public Ships searchShipsCode(String code){
        return navy.stream().filter(ships -> ships.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteCode (String code){
        return navy.remove(searchShipsCode(code));
    }

    public boolean addShip (Ships newShip){
        return navy.add(newShip);
    }

    @Override
    public String toString() {
        return "Navy{" +
                "navy=" + navy +
                '}';
    }
}
