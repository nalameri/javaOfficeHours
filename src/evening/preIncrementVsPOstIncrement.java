package evening;

public class preIncrementVsPOstIncrement {
    public static void main(String[] args) {


     int a=5; //inside we have 5
     int b=++a;//first increment and then do you job (type)==>b is6
        System.out.println(b);
        System.out.println(b++);//post increment first print b which is 6
        //then b=7==>for the next statement
        System.out.println(++b);//pre inc==>immedietly increment and then print




    }
}
