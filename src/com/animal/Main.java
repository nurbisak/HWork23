package com.animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /**
        0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
         Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын.
        Башында 0дор жана аягында 1лер.
         */
        Random random=new Random();
        LinkedList<Integer>linkedList=new LinkedList<>();
        ArrayList<Integer>arrayList=new ArrayList<>();
        int []a = new int[10];
        for (int i = 0; i < a.length ; i++) {
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }
        System.out.println(arrayList);
        arrayList.sort(sort);
        System.out.println(arrayList + "Sortted");
        System.out.println(linkedList);
        linkedList.sort(sort );
        System.out.println(linkedList+ "Sortted linkedlist");
        

    }
    public static Comparator<Integer>sort=new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    };

}
