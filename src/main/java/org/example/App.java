package org.example;

import java.util.ArrayList;
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