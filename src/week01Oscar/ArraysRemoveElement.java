package week01Oscar;
import java.util.Arrays;
import java.util.ArrayList;

public class ArraysRemoveElement {
    public static void main(String[] args) {

    ArrayList<Integer> listOfNumbers = new ArrayList<>();
listOfNumbers.addAll(Arrays.asList(2,3,4,5,6,8,9));

         System.out.println("divisibleByThree(listOfNumbers) = "+

    divisibleByThree(listOfNumbers));
}

//   public static ArrayList<Integer> divisibleByThree(ArrayList<Integer> numbers){
//       numbers.removeIf(eachNumber -> eachNumber%3!=0); // eachNumber%3!=0 : checking if number is not divisible then removes the number from the list
//       return numbers;
//   }

    public static ArrayList<Integer> divisibleByThree(ArrayList<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<>();
//        for(Integer each: numbers){  // ConcurrentModificationException
//            if(each % 3 != 0){
//                numbers.remove(each);
//            }
//        }
        // numbers.removeIf(eachNumber -> eachNumber%3!=0); lambda operator

        for (Integer each : numbers) {
            if (each % 3 == 0) {
                newList.add(each);
            }
        }
        return newList;
    }}