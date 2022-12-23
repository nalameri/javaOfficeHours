package evening;

import java.util.Scanner;

public class t_3EligibleToDonate {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("noor enter your age :");
     int age=input.nextInt();
        System.out.println("noor enter your weight :");
       double weight =input.nextDouble();

       // int age=15;

             if(age>=18 && weight>=50) {

                 System.out.println("You are eligible to donate blood ");
             }else {
                 System.out.println("not eligible");
             }
             }


    }

/*

 */