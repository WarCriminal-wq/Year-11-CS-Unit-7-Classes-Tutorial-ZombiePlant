public class ZombiePlant {
    private final int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatments){
        this.potency = potency;
        this.treatments = treatments;
    }
    public int getPotency(){
        return this.potency;
    }
    public int treatmentsNeeded(){
        return this.treatments;
    }
    public boolean isDangerous(){
        if(treatments>0){
            return true;
        }
        return false;
    }
    public void treat(int Value){

        if (treatments > 0) {
            if((Value > 0) && Value <= potency){
                treatments--;
            }
            else if (Value > 0){
                treatments++;
            }
        }
        else if(Value > potency) {
            treatments++;
        }
    }


}
