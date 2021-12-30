package test;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        String array[] = { "A", "B", "C" };
        for (String a : array) {
            System.out.println("a=" + a);
        }

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String l : list) {
            System.out.println("l=" + l);
        }
    }
}