package ArrayPractice;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedValueInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1,5};
        RepeatedValueInArray rep = new RepeatedValueInArray();
        int repeatedValue = rep.findRepeated(arr);
        System.out.println(repeatedValue + " : Repeated Value");
    }

    public int findRepeated(int[] array) {

        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : array){
            if(map.get(a) == null){
                map.put(a,1);
            }
            else {
                map.put(a, ++count);
            }
        }

        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                return entry.getKey();
            }
        }
        return -1; // Return -1 if no repeated value is found
    }

}
