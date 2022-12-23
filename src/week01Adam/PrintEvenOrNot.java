package week01Adam;

public class PrintEvenOrNot {
    public static void main(String[] args) {

        printEvenOrNot(20);
        printEvenOrNot(15);

    }
    public static void printEvenOrNot(int number){
     //implement the logic

        if(number%2==0){
            System.out.println(number +"is even");
        }else {
            System.out.println(number +" is not even");
        }


    }
}
