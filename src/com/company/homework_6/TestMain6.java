package com.company.homework_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestMain6 {
    public static void main(String[] args) {
        List<Tree<Integer>> myTreeList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Tree<Integer> myTree = new TreeImpl<>();
            for (int j = 0; j < 5; j++) {
                myTree.add((int) (Math.random() * 50 - 25));
            }
            myTreeList.add(myTree);
        }
        for (Tree<Integer> myTree :
                myTreeList) {
            System.out.println(myTree.checkBalance());
            if (myTree.checkBalance()) {
                myTree.display();
            }
        }
    }
}
