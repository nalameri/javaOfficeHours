package week01Oscar;
import java.util.ArrayList;
import java.util.Arrays;
public class mergingTowArrays {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println("merge(list1,list2) = " + Arrays.toString(mergingTwoArrays(list1, list2)));
    }
    // short solution, however you could create loops and add them

    public static Integer[] mergingTwoArrays(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);  // merged arraylists(method)
        Integer[] result = list1.toArray(new Integer[0]);
        return result;
    }

// short solution, however you could create loops and add them
//    public static Integer[] merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
//            list1.addAll(list2);  // merged arraylists
//            Integer[] result = list1.toArray(new Integer[0]);
//            return result;
//    }
public static Integer[] merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
        Integer[] result = new Integer[list1.size()+list2.size()];
        int index = 0;
        for (Integer integer : list1) {
        result[index] = integer; // 0,1,2
        index++;  // post increment : 1,2,3 : exit loop
        }
        // System.out.println("index = " + index); // 3
        for (Integer integer : list2) {
        result[index] = integer;
        index++;
        }
        return result;
        }



}
