public class SlotMachine {
    private int payoutcycle, payoutamount, timetillnextpay;
    
    public SlotMachine(int pc, int pa, int tp){
        payoutcycle = pc;
        payoutamount = pa;
        timetillnextpay = tp;
    }
    
    public int pull(){
        timetillnextpay--;
        if(timetillnextpay == 0){
            timetillnextpay = payoutcycle;
            return payoutamount;
        }
        else return 0;
    }
}
