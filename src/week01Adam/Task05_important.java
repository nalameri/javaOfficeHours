package week01Adam;

public class Task05_important {
    public static void main(String[] args) {

   int first =53;
   int second =34;//to find if there is common digits between two numbers

      if((first>=25&&first<=75)&&(second>=25&&second<=75)){//important step


          int LastDigitOfFirstNumber=first%10;
          int firstDigitOfFirstNumber =first/10;
          int lastDigitOfSecondNumber=second%10;
          int firstDigitOfSecondNumber =second/10;


          if((firstDigitOfFirstNumber==lastDigitOfSecondNumber)||
                  (firstDigitOfFirstNumber==lastDigitOfSecondNumber)||
                  (LastDigitOfFirstNumber==firstDigitOfSecondNumber)||
                  (LastDigitOfFirstNumber==lastDigitOfSecondNumber)){
              System.out.println(true);
          }



      }else {
          System.out.println(false);
      }
















    }
}
