package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploCopy {

    public static void main(String[] args) {

        List<Integer> myIntns = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<>();

        copy(myIntns, myObjects);
        copy(myDoubles, myObjects);


        printList(myObjects);
    }

    //List<? extends Number> covariante ex get -ok e put error
    // List<? super Number> contravariante ex get - error e put ok
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }


    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}
