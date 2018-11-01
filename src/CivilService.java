public class CivilService implements NationalService {
    private Integer daysLeft;

    public CivilService(){
        daysLeft = 362;
    }

    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }

    @Override
    public void work(){
        this.daysLeft--;
    }
}
