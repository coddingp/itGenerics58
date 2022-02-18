package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        OldGenerics oldGenerics = new OldGenerics(25);

        OldGenerics oldGenerics2 = new OldGenerics("25 тысяч");

        System.out.println(oldGenerics + "" + oldGenerics2);

        ArrayList<String> str = new ArrayList<>();

        str.add("0");

        str.add("1");

        System.out.println(str);

        NewGenerics newGenerics = new NewGenerics(str);
        NewGenerics newGenerics2 = new NewGenerics(25);
        System.out.println(newGenerics + "" + newGenerics2);

        MyGeneric myGeneric = new MyGeneric(555);
        MyGeneric myGeneric2 = new MyGeneric("555 as String value");
        System.out.println(myGeneric + "" + myGeneric2);

        Cat catSymba = new Cat("Symba", 10, 5);

        MyGeneric myGeneric3 = new MyGeneric(catSymba);

        System.out.println(myGeneric + "" + myGeneric2 + "" + myGeneric3);

        GenericIntegerString genericIntegerString = new GenericIntegerString(2546, "WAEFejsakfen");

        System.out.println(genericIntegerString);

        List list = new LinkedList();

        list.add(genericIntegerString);
        list.add(myGeneric);
        list.add(myGeneric2);
        list.add(myGeneric3);
        list.add(newGenerics);


        //This method prints any collection of any data type.
        System.out.println(list);

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3};
        Character[] charArray = {'H', 'E', 'L', 'L', 'o'};
        System.out.println("Integer Array: ");
        printArr(intArray);
        System.out.println("Double Array: ");
        printArr(doubleArray);
        System.out.println("Character Array: ");
        printArr(charArray);


        //Method that returns first and the last element of array
        System.out.println(returnsFirstAndLast(intArray));
        System.out.println(returnsFirstAndLast(doubleArray));
        System.out.println(returnsFirstAndLast(charArray));


        System.out.printf("Крупнейшее из %d, %d и %d это %d",
                3, 4, 5, greatest(3, 4, 5));
        System.out.printf("\n\nКрупнейшее из %.1f, %.1f и %.1f это %.1f",
                3.3, 3.3, 5.5, greatest(3.3, 4.4, 5.5));
        System.out.printf("\n\nКрупнейшее из %s, %s и %s это %s",
                "шапка", "куртка", "туфли",
                greatest("шапка", "куртка", "туфли"));
        System.out.println();

//        Integer[]  fiveInTheList = new Integer[5];
//        fiveInTheList[0]=5;
//        fiveInTheList[1]=4;
//        fiveInTheList[2]=3;
//        fiveInTheList[3]=2;
//        fiveInTheList[4]=10;
//
//        System.out.printf("Крупнейшее из %d, это %d", fiveInTheList, greatestOfArray(0, fiveInTheList));



    }

//    private static <T extends Comparable<T>> T greatestOfArray(T x, T[] z) {
//        T max = x; //Пока что, Х максимальное
//        for (int i = 0; i < z.length; i++) {
//            if (i + 1 < z.length) {
//                if (z[i+1].compareTo(max) > 0) {
//                    max = z[i+1]; // Значит Y больше X
//                }
//                if (z[i].compareTo(max) > 0) {
//                    max = z[i]; // Значит Z больше всех
//                }
//            }
//        }
//        return max;
//    }

    private static <T extends Comparable<T>> T greatest(T x, T y, T z) {
        T max = x; //Пока что, Х максимальное
        if (y.compareTo(max) > 0) {
            max = y; // Значит Y больше X
        }
        if (z.compareTo(max) > 0) {
            max = x; // Значит Z больше всех
        }
        return max;
    }

    //This method prints any collection of any data type.
    public static <T> void printArr(T[] arr) {
        for (T element : arr) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    //Method that returns first and the last element of array
    // of any type of data. and you can print it or add to any Collection etc.
    public static <T> List returnsFirstAndLast(T[] arr) {
        List list = new ArrayList();
        list.add(arr[arr.length - 1]);
        list.add(arr[0]);
        return list;
    }
}