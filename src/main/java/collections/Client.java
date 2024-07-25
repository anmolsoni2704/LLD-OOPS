package main.java.collections;


import java.util.*;

public class Client {
    public static void main(String[] args) {
        /*
        Collection interface is the root interface of the Collections framework.
        Mainly 3 interfaces List, Queue and Set which are further extended from the collection interface.
         */

        /*
        List Interface -> ArrayList, LinkedList, Stack, Vector
         */

        /*
        Array List - Resizeable implementation of List Interface.
        It's not thread safe.
        It's actually implemented using Arrays.
         */
        List<String> list1 = new ArrayList<>();
        list1.add("Anmol");
        list1.add("Akash");
        list1.add("Aditi");
        System.out.println(list1);

        /*
        Linked List - Implemented using Doubly LinkedList.
        It's not thread safe.
        Random access using index is slower as compared to ArrayList.
         */
        List<String> list2 = new LinkedList<>();

        /*
        Vector - Implemented using Arrays.
        It's thread safe.
        Preferrable in multi-threaded environment.
         */
        List<String> list3 = new Vector<>();

        /*
        Stack - Extended from Vector.
        Supports LIFO.
        It's also thread safe.
        Used in multi-threaded environment.
         */
        List<String> list4 = new Stack<>();

        /*
        Set Interface - Hashset, LinkedHashset, TreeSet, EnumSet
        No duplicate elements are allowed.
        Constant time operations for search, insert, delete - O(1)
        None of them are thread safe.
         */
        //Order is not maintained
        Set<String> set1 = new HashSet<>();
        set1.add("Anmol");
        set1.add("Akash");
        set1.add("Aditi");
        System.out.println(set1);

        //Retains order in which it was entered
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Anmol");
        set2.add("Akash");
        set2.add("Aditi");
        System.out.println(set2);

        //Natural order is maintained
        Set<String> set3 = new TreeSet<>();
        set3.add("Anmol");
        set3.add("Akash");
        set3.add("Aditi");
        System.out.println(set3);

        /*
        Enums - Enums are constants.
        Whenever you have some predefined strings or constants, we use enums.
         */
        Payment p1 = new Payment();
        p1.status = PaymentStatus.APPROVED;
        Payment p2 = new Payment();
        p2.status = PaymentStatus.REJECTED;

        /*
        EnumSet - It's used to play around with enums
         */
        Set<PaymentStatus> set5 = EnumSet.allOf(PaymentStatus.class);
        System.out.println(set5);

        EnumSet<PaymentStatus> set6 = EnumSet.of(PaymentStatus.APPROVED, PaymentStatus.REJECTED);
        EnumSet<PaymentStatus> set7 = EnumSet.complementOf(set6);
        System.out.println(set6);
        System.out.println(set7);

        /*
        Queue - Priority Queue, Deque
         */

        Queue<String> queue1 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        queue1.add("Anmol");
        queue1.add("Akash");
        queue1.add("Aditi");
        queue1.add("Sumit");
        queue1.add("Dinesh");

        /*
        Priority queue is nothing but a data structure
        min heap and max heap, by default pq is min heap
         */

        System.out.println(queue1.peek());
        while(!queue1.isEmpty()){
            System.out.println(queue1.peek());
            queue1.poll();
        }

        /*
        Comparable and Comparator Interfaces
         */
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list1);

        List<Student> list = new ArrayList<>();
        Student s1 = new Student("Anmol", 98, "Bharath");
        Student s2 = new Student("Akash", 96, "Manan");
        Student s3 = new Student("Aditi", 97, "Greenfield");
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list);
        for (Student s: list) {
            System.out.println(s.name + " " + s.psp + " " + s.univName);
        }

         /*
        Comparator interface
         */
        Collections.sort(list, new StudentPSPComparator());

        for (Student s: list) {
            System.out.println(s.name + " " + s.psp + " " + s.univName);
        }
    }
}
