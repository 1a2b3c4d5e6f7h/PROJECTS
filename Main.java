
// How Encapsulation works!
import java.util.Scanner;
class BanckAccount{
    private int balance;
    
    public BanckAccount(){
        int balance = 0;
    }
    //getters
    public int get(){
        return balance;
    }
    //setters
    public void set(int balance){
        this.balance = balance;
    }
    
    //deposit
    public void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Succefully Deposited!");
        }
        else if(amount == 0){
            System.out.println("Meaningless try!");  
        }
        else{
              System.out.println("You are not allowed to deposit this amount");
        }
    }
    
    // withdraw
    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
              System.out.println("Succefully withdrew!");
        }
        else{
              System.out.println("Your current balance is insufficient");
              
        }
            
            
    }
    
    public void check(){
        System.out.println("You Current Balance: "+balance);
    }
    
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      BanckAccount b = new BanckAccount();
      int choice;
      int ch;
      do{
          System.out.println("--------Options--------:");
          System.out.println("Enter 1 for Deposit::");
          System.out.println("Enter 2 for Withdraw:");
          System.out.println("Enter 3 to check Balance:");
          System.out.println("Enter 4 to Exit!");
          System.out.print("Choice: ");
          choice = sc.nextInt();
          switch(choice){
              case 1:
                  System.out.print("Enter amount to Deposit:");
                  int depAmount = sc.nextInt();
                  b.deposit(depAmount);
                  break;
             case 2:
                  System.out.print("Enter amount to Withdraw:");
                  int withAmount = sc.nextInt();
                  b.withdraw(withAmount);
                  break;
             case 3:
                  b.check();
                  break;
             case 4:
                   System.out.print("Good Bye!");
                  break;
             default:
               System.out.print("Wrong Option!");
          }
          System.out.print("press any Number to continue or 4 to Exit!");
          ch = sc.nextInt();
      }while(ch !=4);
      System.out.print("Good Bye!");
      sc.close();
      
      
 
  }
}
