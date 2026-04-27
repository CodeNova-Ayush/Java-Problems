import java.util.Scanner;
 public class lonewolf{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of the  array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array elements:");
            
            for(int i=0;i<arr.length;i++){
                arr[i]=s.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                int count =1;
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j] && i!=j){
                        count++;
                        break;
                        
                    }
                }
                if(count==1){
                    System.out.println("lonely number is :" + arr[i]);
                }
            }
    }
}