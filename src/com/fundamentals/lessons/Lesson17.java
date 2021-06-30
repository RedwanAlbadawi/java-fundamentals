package com.fundamentals.lessons;

import com.fundamentals.java.House;

import java.util.*;

/*
* The java.until.* should not be used in favor of
* indivdual imports do to the memory limitations.
*
* This class goes over tjee Lesson 17 content
* Collection Framework
* */
public class Lesson17 {

    public void exampleArrayList1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("Wednesday");
        list.add("Not Monday");
        list.add("Where's Friday");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        } // end for loop
    } // end method

    public void exampleArrayList2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(42);
        list.add(103);
        list.add(10);

        for (Integer number : list){
            System.out.println(number);
        } // end for loop
    } // end method

    public void exampleArrayListHouse(){
        ArrayList<House> housesList = new ArrayList<>();
        housesList.add(new House());
        housesList.add(new House("green"));
        housesList.add(new House("blue", "Steel",
                "Concerte", 32));

        for (House house : housesList){
            System.out.println(house.getDoorColor());
            System.out.println(house.getFoundationType());
            System.out.println(house.getRoofStyle());
            System.out.println(house.getWindowSize());
        } // end for loop
    } // end method

    public void exampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparkelers");
        myHash.add("Fountains");

        Iterator<String> iterate = myHash.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        } // end while

        // enhanced for loop version
        for (String hash : myHash) {
            System.out.println(hash);
        } // end while
    } // end method

    public void exampleHashMap() {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Wednesday");
        myMap.put(15, "Thursday");
        myMap.put(20, "Friday");
        myMap.put(25, "Saturday");

        for (Map.Entry<Integer, String> myItem : myMap.entrySet()){
            System.out.println(myItem.getKey() + " = " + myItem.getValue());
        } // end for loop
    } // end method
} // end class
