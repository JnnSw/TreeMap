/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import x.mavenproject5.TreeMap;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TestTreeMap {
    
    
    @org.junit.Test
    public void addGet() {
        TreeMap<String, Integer> tree = new TreeMap();

        tree.add("hello",1);
        tree.add("friend",2);
        tree.add("5",5);

        assertTrue(1==tree.get("hello"));
        assertTrue(2==tree.get("friend"));
        assertTrue(5==tree.get("5"));
      
    }
}
