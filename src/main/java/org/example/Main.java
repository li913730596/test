package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i < 4; i ++){
            list.add(new ArrayList<>());
        }
        List<Integer> integers = list.get(1);
        if(integers == null){
            integers = new ArrayList<>();
        }
        integers.add(1);
        list.set(1,integers);

        System.out.println(list);
    }
}