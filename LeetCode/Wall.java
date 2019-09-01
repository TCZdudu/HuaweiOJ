package LeetCode;

import java.util.*;

public class Wall {
    public static void main(String[] args) {
        // List<List<Integer>> wall = new List<List<Integer>>() {{1,2,2,1},{3,1,2},{1,3,2},{2,4},{3,1,2},{1,3,1,1}};
//        List<List<Integer>> wall = new ArrayList<>();
//        wall.add(Arrays.asList({1,2,2,1}))
        int[][] wall = {{1}, {1},{1}};
        int sum;
        Map<Integer,Integer> res= new HashMap<>();
        for (int i = 0; i < wall.length; i++) {
            sum = 0;
            for (int j = 0; j < wall[i].length-1; j++) {
                sum += wall[i][j];
                if(res.containsKey(sum)){
                    res.put(sum,res.get(sum)+1);
                }else {
                    res.put(sum,1);
                }
            }
        }
        if(res.isEmpty()){
            System.out.println(wall.length);
        }else {
            System.out.println(wall.length - Collections.max(res.values()));
        }
    }
}