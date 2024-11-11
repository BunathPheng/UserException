import static java.lang.StringTemplate.STR;

public interface Functionalies {
     void deposit(Double amountOfCash);
     void withdraw(Double amountOfCash);
     void ShowBlance();
}
class Account implements Functionalies{
   private Double amountOfCash;
   private String accountType;
   public  Account(){};
   public Account(Double amountOfCash, String accountType) {
       this.amountOfCash = amountOfCash;
       this.accountType = accountType;
   }
    @Override
    public void deposit(Double amountOfCash) {
        this.amountOfCash = (this.amountOfCash == null ? 0D : this.amountOfCash) + amountOfCash;
    }

    @Override
    public void withdraw(Double amountOfCash) {
       if(this.amountOfCash < amountOfCash){
           System.out.println("Your money is low than  old money");
       }else {
           this.amountOfCash = this.amountOfCash - amountOfCash;
       }
    }

    @Override
    public void ShowBlance() {
        System.out.println(STR."Your \{this.accountType} have money \{this.amountOfCash}");
    }
}
