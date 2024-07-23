package BTT7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baitapkhac {
    public static void main(String[] args) {
        List<Integer> array01 = new ArrayList<>();
        array01.add(1);
        array01.add(2);
        array01.add(3);
        array01.add(4);
        for (Integer e : array01) {
            System.out.println(e + " ");
        }
        Collections.reverse(array01);
        for (Integer e : array01) {
            System.out.println(e + " ");
        }
    }
}
