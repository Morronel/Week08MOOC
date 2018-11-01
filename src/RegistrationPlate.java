public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString(){
        return country+ " "+regCode;
    }

    @Override
    public int hashCode() {
        return (this.regCode.hashCode() + this.country.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }

        if (getClass() != obj.getClass()){
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) obj;

        if (this.regCode == compared.regCode && this.country == compared.country){
            return true;
        }

        return false;
    }
}
