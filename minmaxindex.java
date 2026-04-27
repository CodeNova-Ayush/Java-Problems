import java.util.Scanner;
 public class minmaxindex{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of the  array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array elements:");
            
            for(int i=0;i<arr.length;i++){
                arr[i]=s.nextInt();
            }
            int max =arr[0];
            int min = arr[0];
            int indexmin=0;
            int indexmax = 0;
            for(int i=1;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                    indexmax =i;
                }
                if(min>arr[i]){
                    min=arr[i];
                    indexmin=i;
                }
            }
            System.out.println("maximum elemenet in this  array :" + max);
            System.out.println("min elemenet in this  array :" + min);
            System.out.println("maximum elemenet index in this  array :" + indexmax);
            System.out.println("min elemenet index in this  array :" + indexmin);
            
        
        
       
    }
    
}