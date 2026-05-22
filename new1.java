// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class new1 {
   public class1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter no. of student :");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      for(int var5 = 0; var5 < var2; ++var5) {
         System.out.print(var3[var5] + " ");
      }

   }
}