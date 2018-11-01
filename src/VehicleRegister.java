import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners = new HashMap<>();

    public boolean add(RegistrationPlate plate, String owner){
        if (owners.get(plate) != null) {
            return false;
        }
        else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate){
        if (owners.containsKey(plate)){
            return owners.get(plate);
        }
        else{
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate){
        if (owners.get(plate) == null){
            return false;
        }
        else{
            owners.remove(plate);
            return true;
        }
    }

    public void printRegistrationPlates(){
        for(Map.Entry<RegistrationPlate, String> entry : owners.entrySet()){
            System.out.println(entry.getKey());
        }
    }

    public void printOwners(){
        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<RegistrationPlate, String> entry : owners.entrySet()){
            if (list.contains(entry.getValue()) == false){
                list.add(entry.getValue());
            }
        }

        System.out.println(list);
    }
}
