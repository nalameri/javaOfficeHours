package week01Oscar;
import java.util.Arrays;
import java.util.ArrayList;
public class mergeUnique {
    public static ArrayList<Integer> mergeUnique(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();
        // How can you check if a list contains an element? result.contains(element): if the element not contained add it to our list
        for (int i : arr1) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        for (int i : arr2) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    public static ArrayList<String> mergeUnique(String[] arr1, String[] arr2){  // same name different parameters
        ArrayList<String> result = new ArrayList<>();
        // How can you check if a list contains an element? result.contains(element): if the element not contained add it to our list
        for (String i : arr1) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        for (String i : arr2) {
            if(!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
