package org.structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInfo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        names.add("juan");
        names.add("maria");
        names.add("jose");
        names.add("Pedro");
        names.add("josefina");

        List<String> moreNames = new ArrayList<String>();
        moreNames.add("Zoro");
        moreNames.add("Guts");
        moreNames.add("Tanjiro");
        moreNames.add("Kaneki");
        moreNames.add("Juzo");

        names.addAll(moreNames);
        names.set(0, "Io");

        System.out.println(names.get(0));

        System.out.println("The size of names is "+names.size());
        //System.out.println("The name is in the list: "+);
        if(names.contains("Io")){
            System.out.println("The name is in the list");
        }

        if(!names.isEmpty()){
            System.out.println("The is list is not empty");
        }

        names.remove(3);
        names.remove("jose");

        System.out.println("Guts is in the position number: "+names.indexOf("Guts"));
        //names.clear();

        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            System.out.println("Name "+ namesIterator.next());
        }
   }
}

