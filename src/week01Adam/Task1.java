package week01Adam;

public class Task1 {
    public static void main(String[] args) {

        //data type variable name=value;

        //get the first integer
        //get the second integer

        int num1 = 25;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println("sum =" + sum);
        System.out.println("---------------difference---------------------");

        int subtract = num1 - num2;//calculating

        System.out.println("subtract = " + subtract);//printing

        System.out.println("-----------------product------------------------------");

        //product==multiplying
        int product = num1 * num2;
        System.out.println("product = " + product);

        System.out.println("-------------------average-------------------------------");

        double average = (num1 + num2) / 2; // average=sum/2;
//we used double bcz its given as 15.0
        System.out.println("average = " + average);


        float f = 100;//implicit casting bcs we put int into float which is bigger

        System.out.println("====================max-min==============================");

        int max, min;


        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;

            System.out.println("max = " + max);
            System.out.println("min = " + min);


        }                                                                        
    }
    }                                                                         

