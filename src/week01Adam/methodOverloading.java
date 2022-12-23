package week01Adam;

public class methodOverloading {
    public static void main(String[] args) {
         sum(8,2);


    }
    public static int sum(int num1,int num2){
     return    num1+num2;
    }
    public static void sum(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }

}
