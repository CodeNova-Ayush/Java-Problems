import java.util.Scanner;
 class accountHolderName
 {
     String holder;
   String deposit(){
        System.out.println("Account Holder Name:");
        Scanner scan =new Scanner(System.in);
                 holder =scan.nextLine();
                 return holder;
    }
}

class accountNumber{
    int number;
    int withdraw(){
        System.out.println("Account Number:");
        Scanner scan=new Scanner(System.in);
             number=scan.nextInt();
             return number;
    }
}

class Balance{
    int che;
    int check(){
        System.out.println("Check Balance:");
        Scanner scan=new Scanner(System.in);
            che=scan.nextInt();
            return che;
    }
}

public class bank
 {
   public static void main(String[] args){
    accountHolderName e=new accountHolderName();
    accountNumber r=new accountNumber();
    Balance c=new Balance();
    
     String name=e.deposit();
    int with=r.withdraw();
     int che=c.check();
   
   
     
     System.out.println("Name: "+name);
     System.out.println("Account Number"+with);
     System.out.println("Check Balance"+che);
     
}
}