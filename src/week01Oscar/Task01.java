package week01Oscar;

public class Task01 {
    public static void main(String[] args) {


    /*
    Declare
     */

    int firstInt=9 ;
     int secondInt=6;
      int sum;
     sum=firstInt + secondInt;

        System.out.println("sum ="+ sum);
      int average=8;//average ia double data type
     average =(firstInt+secondInt)/2 ;
        System.out.println("average ="+average);//implicit casting

       //average =double(firstInt+secondInt)/2;

        System.out.println("average ="+average);
        System.out.println("----------------------------------------------");
int max;
int min;
        boolean isMaxFirstInteger=firstInt>secondInt;
        System.out.println("is max first integer "+isMaxFirstInteger);

       if(isMaxFirstInteger){
        max = firstInt;
         min =secondInt;
            }else {
           max =secondInt;
           min =firstInt;
       }

        System.out.println("max ="+max);
        System.out.println("min ="+ min);
    }
}
