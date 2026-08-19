/**
 *  Java program to demonstrate TreeSet.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating HashSet instance.
        Set<Integer> mySet = new TreeSet<>();

        // Add.
        mySet.add(4);
        mySet.add(2);
        mySet.add(8);
        mySet.add(6);

        // Display.
        System.out.println(mySet);

        // Remove.
        mySet.remove(6);

        // Display.
        System.out.println(mySet);

        // Remove.
        mySet.remove(4);

        // Display.
        System.out.println(mySet);

        // Remove.
        mySet.remove(8);

        // Display.
        System.out.println(mySet);

    }
}