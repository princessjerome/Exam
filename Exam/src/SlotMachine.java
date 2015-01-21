public class SlotMachine {
    private int payoutcycle, payoutamount, timetillnextpay;
    
    //overloaded constructors
    public SlotMachine(){
        payoutcycle = 0;
        payoutamount = 0;
        timetillnextpay = 0;
    }
    
    public SlotMachine(int pc, int pa, int tp){
        payoutcycle = pc;
        payoutamount = pa;
        timetillnextpay = tp;
    }
   
    public int pull(){
        
        timetillnextpay--;
        //checks whether you won
        if(timetillnextpay == 0){
            timetillnextpay = payoutcycle;
            return payoutamount;
        }
        //if not return no money
        else return 0;
    }
}
