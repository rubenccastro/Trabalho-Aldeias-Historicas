package nicee;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) 
    {
        int nums[]= new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Insira 10 números inteiros:");
        for(int i=0; i<nums.length;i++) {
            nums[i]=input.nextInt();
        }
        input.close();
        for(int i=0; i<nums.length;i++) {
            if (nums[i]%2==1) {
                System.out.print(nums[i]+ " ");
            }
        }
        for(int i=0; i<nums.length;i++) {
            if (nums[i]%2==0) {
                System.out.print(nums[i]+ " ");
            }
        }
    }
}