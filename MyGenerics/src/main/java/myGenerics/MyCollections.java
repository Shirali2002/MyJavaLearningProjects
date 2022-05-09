/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Shireli
 */
public class MyCollections {

    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new LinkedList<>();
        Collection<String> coll = Collections.synchronizedList(new ArrayList<String>());
        Vector<String> v = new Vector<>(1000);
    }
}
