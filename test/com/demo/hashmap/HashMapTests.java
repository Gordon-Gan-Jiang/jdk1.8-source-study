package com.demo.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gordon.Gan
 */
public class HashMapTests {

    public static void main(String[] args) {
        // write your code here
        Map map=new HashMap();
        map.putIfAbsent("gordon","24");
        System.out.println(map.values());
    }
}
