import java.util.Scanner;
public class voteeligibility {
    static public void main(String[] args){
        Scanner age = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int num = age.nextInt();
        if(num>=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Growwww first then come to Vote");
        age.close();





    }
    
}
