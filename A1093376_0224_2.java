import java.util.*;

public class A1093376_0224_2{
    public static void main(String args[]){
        int num;
        System.out.println("請輸入一個攝氏溫度(°C):");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        System.out.println("此攝氏溫度(°C)的華氏溫度(°F)為："+((num*9/5)+32));
    }
}