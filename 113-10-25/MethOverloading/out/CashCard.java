class CashCard {
    private String number;
    private int balance;
    private int bonus;
    private  final  int BONUSCASH = 10 ;
    
    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    String getNumber(){
        return  this.number;
    }


    int getBalance(){
        return  this.balance;
    }
    int getBonus(){
        return  this.bonus;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    void store(int money){
        if(money>0){
            this.balance+= money;
            if(money >= 1000){
                this.bonus +=money/1000;
            }
        }else{
            System.out.println("儲值金額為負,來亂的!");

        }
    }

    void  charge(int money){
        if(money>0){
            if(money <= this.balance){
                this.balance -= money;
            }
            else {
                System.out.println("餘額不足,可憐哪!");
            }

        }
        else{
            System.out.println("扣除金額為負,來亂的!");
        }
    }

    int exchange(int bonus)
    {
        if(bonus > 0 ){
            this.bonus -= bonus;

        }
        return  this.bonus;


    }



    public  int exchange(int bonus){
        if(bonus> 0 && this.bonus>= bonus ){
            this.bonus -=bonus;
            setBalance(this.balance +bonus *BONUSCASH);
        }
        else {
            System.out.println("點數不足")
        }

        return  this.bonus;
    }

}
