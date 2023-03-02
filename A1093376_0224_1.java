import java.util.*;

public class A1093376_0224_1{
    public static void main(String args[]){
        int num;
        System.out.println("請輸入一個整數:");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        if(num%2==0){
            System.out.println("偶數");
        }
        else{
            System.out.println("奇數");
        }
    }
}