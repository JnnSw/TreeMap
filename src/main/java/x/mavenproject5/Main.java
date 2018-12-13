/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
      public static void main(String[] args) {
        
     TreeMap<String,Integer> tree=new TreeMap();
        Scanner in = new Scanner(System.in);
        String key;
        Integer value;
        System.out.println("1.add\n2.get\n3.end");
        int x=in.nextInt();
          while (x != 3){
            switch (x) {
                case 1:
                      System.out.print("key=");
                     // key = in.nextLine();
                      key=in.next();
                      System.out.print("value=");
                      value = in.nextInt();
                      tree.add(key, value);
                    break;
                case 2:
                    System.out.print("key=");
                    key = in.next();
                    value = tree.get(key);
                    if (value == null) {
                        System.out.println("no value");
                        return;
                    }
                    System.out.println(key + ":"+ value.toString());
                    break;
            }
            System.out.println("1.add\n2.get\n3.end");
            x=in.nextInt();
        } 
    }
}
