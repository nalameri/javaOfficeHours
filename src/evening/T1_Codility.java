package evening;

import javax.print.attribute.standard.PresentationDirection;

public class T1_Codility {
    public static void main(String[] args) {


     int number=30;

         if(number>0) {
         String result="" ;
           if(number%2==0) {
               result+="Codility";
           }
           if(number%3==0){
             result+="Test";
             if(number%5==0){
                 result+="Coders";
             }
               System.out.println(result);
           }
         }else {
             System.out.println("invalid number or zero");
         }




    }
}
