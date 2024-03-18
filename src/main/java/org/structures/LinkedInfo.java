package org.structures;

import java.util.LinkedList;

public class LinkedInfo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("juan");
        list.add("maria");
        list.add("jose");
        list.add("Pedro");
        list.add("josefina");

        list.addFirst("Zoro");
        list.addLast("Sanji");
        list.set(2, "Robin");

        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("length " + list.size());
        System.out.println("First result " + list.peek());
    }
}
