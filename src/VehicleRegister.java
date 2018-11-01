import java.util.HashMap;

public class VehicleRegister {
    HashMap<RegistrationPlate, String> owners = new HashMap<>();

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
}
