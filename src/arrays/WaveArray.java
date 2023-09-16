package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        System.out.println(waveArray(A));
    }

    public static ArrayList<Integer> waveArray(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        for (int i = 1; i < n; i += 2) {
            int temp = A.get(i);
            A.set(i, A.get(i - 1));
            A.set(i - 1, temp);
        }
        return A;

    }
}
