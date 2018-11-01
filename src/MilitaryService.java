public class MilitaryService implements NationalService{
    private Integer daysLeft;

    public MilitaryService(Integer daysLeft){
        this.daysLeft = daysLeft;
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
