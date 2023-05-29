class ParkingSystem {
    Slots slot;
    public ParkingSystem(int big, int medium, int small) {
        slot = new Slots(big, medium, small);
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(slot.big==0) return false;
            int temp=slot.big;
            slot.big=temp-1;
        }else if(carType==2){
            if(slot.medium==0) return false;
                int temp=slot.medium;
                slot.medium=temp-1;
        }else{
            if(slot.small==0) return false;
                int temp=slot.small;
                slot.small=temp-1;
        }
        return true;
        
    }
}
class Slots{
    int big;
    int medium;
    int small;
    
    Slots(int big, int medium, int small){
        this.big=big;
        this.medium=medium;
        this.small=small;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */