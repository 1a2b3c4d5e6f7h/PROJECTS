/*The following code shows how Ecapsulation works
*/
import java.util.Scanner;
class Main{
    private int balance;
    
    public Main(){
        this.balance = 0;
    }
     //getters
     public int get(){
        return balance ;
    }
    //Setters 
    public void set(int balance){
        this.balance = balance;
    }
    
    public void deposit(int amount){
     
        if(amount > 0 ){
       this.balance += amount;
      System.out.println("Successfully deposited: " + amount);
        }
        else{
        System.out.println("You are not allowed to deposit this amount!");
         }
       
       
    }
    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully withdrawn: " + "-"+amount);
            
        }
        else{
            System.out.println("Not Allowed ");
        }
        
        
    }
    
    public void check(){
        System.out.println("Your current Balance: "+ balance);
    }
    
    
  
    
}

 public class BanckAccount{
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
     Main ob = new Main();
      int choice;
      int ch;
      
       

        do{
             System.out.println("------Menu!------ ");
          System.out.println("1, Deposit! ");
          System.out.println("2, Withdraw! ");
          System.out.println("3, Check balance! ");
          System.out.println("4, Exit ");
          System.out.print("Choice:  ");
                    
          choice = sc.nextInt();
          switch(choice){
              case 1:
                  System.out.print("Enter Amount to Deposit: ");
                  int depAmount = sc.nextInt();
                  ob.deposit(depAmount);
                  break;
            case 2:
                     System.out.print("Enter Amount to withdraw: ");
                     int withdraw = sc.nextInt();
                     ob.withdraw(withdraw);
                     break;
            case 3:
                 System.out.println("Welcome to Checking Yr Balance!");
                  ob.check();
                  break;
                  
                  case 4:
                        System.out.println("Good bye!");
                        break;
                default :
                System.out.println("Wrong option, try agian: ");
                
                
          } 
         System.out.println("press any Number to continue, 4 to Exit!");
         ch = sc.nextInt();
                  
     }while(ch != 4);
     System.out.println("Good bye!");
     sc.close();
  }
}