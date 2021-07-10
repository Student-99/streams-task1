import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] finalArray;
        StringBuilder s = new StringBuilder();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        for (int i : intList) {
            if ((i >= 0) && (i % 2 == 0)) {
                s.append(i+" ");
            }
        }
        String[] s1 = s.toString().split(" ");
        finalArray = new int[s1.length];

        for (int i = 0; i < s1.length; i++) {
            finalArray[i] = Integer.parseInt(s1[i]);
        }

        int t;
        for (int i = 0; i < finalArray.length; i++)
            for (int j = i + 1; j < finalArray.length; j++)
                if (finalArray[j] < finalArray[i]) {
                    t = finalArray[i];
                    finalArray[i] = finalArray[j];
                    finalArray[j] = t;
                }

        for (int i:finalArray){
            System.out.println(i);
        }

    }
}
