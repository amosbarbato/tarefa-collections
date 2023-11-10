package java_collection;

import java.util.Arrays;
import java.util.Scanner;

public class sortedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes separando-os por virgula ',' :");
        String[] arrayList = s.nextLine().split(", ");

        Arrays.sort(arrayList);

        for (String i : arrayList) {
            System.out.println(i);
        }

        s.close();
    }
}
