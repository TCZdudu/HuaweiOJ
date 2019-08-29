package Huawei201908;

import java.util.Scanner;

public class Monkey {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            int n = s.nextInt();
            System.out.println(func2(n-1));
        }

    }

    public  static  int func(int n){
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1;
        }else if(n==3){
            return 2;
        }else
            {
            return func(n-1)+func(n-3);
        }
    }

    public static int func2(int n){
        int[] res = new int[n+1];
        res[0] = res[1] = res[2] = 1;
        for(int i=3;i<=n;i++){
            res[i] = res[i-3] + res[i-1];
        }
        return res[n];
    }
}
