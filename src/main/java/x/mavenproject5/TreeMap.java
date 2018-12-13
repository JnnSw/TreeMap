/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x.mavenproject5;

import java.util.Comparator;

/**
 *
 * @author User
 */
public class TreeMap<keyType, valueType> {
    public class TreeNode implements Comparable<TreeNode> {
        public keyType key;
        public valueType value;

        public TreeNode left;
        public TreeNode right;

        public TreeNode(keyType key, valueType value) {
            this.key = key;
            this.value = value;
        }

        public void set(TreeNode node) {
            this.key = node.key;
            this.value = node.value;
        }
        
        @Override
        public int compareTo(TreeNode node) {
            return compareKeys(key, node.key);
        }
    }

    public TreeNode root;

    public Comparator<? super keyType> comparator;

    public
        int compareKeys(keyType key1, keyType key2) {
        if (comparator == null) {
            return ((Comparable) key1).compareTo(key2);
        }
        return comparator.compare(key1, key2);
    }

    public TreeMap() {
        comparator = null;

    }

    public void add(keyType key, valueType value) {
        boolean check1=true;
        if (comparator == null && !(key instanceof Comparable)) {
            System.out.print("If key isn't comparable you must set comparator!");
            check1=false;         
        }
        if (check1)
        {
        TreeNode nodeNew = new TreeNode(key, value);
        if (root == null) 
        {
            root = nodeNew;
            return;
        }
        TreeNode curr = root;
        boolean check2=true;
        while(check2) 
        {
            int res = curr.compareTo(nodeNew);
            if (res == 0) {
                curr.set(nodeNew);
                check2=false;
            }
            else{
                if (res > 0) {
                if (curr.right == null) {
                    curr.right = nodeNew;
                    check2=false;
                }
                curr = curr.right;
            } else {
                if (curr.left == null) {
                    curr.left = nodeNew;
                    check2=false;
                }
                curr = curr.left;
            }
            }
            
           
       }
        }
    }

    public valueType get(keyType key) {
        TreeNode node = root;
        while (node != null) 
        {
            int res = compareKeys(node.key, key);
            if (res == 0) {
                return node.value;
            }
            else{
              if (res > 0) {
                node = node.right;
            } else {
                node = node.left;
            }  
            }
            
        }

        return null;
    }

}
