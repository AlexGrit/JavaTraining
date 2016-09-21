package com.homework1;

/**
 * Created by agritsenko on 9/19/2016.
 */
public class Fib {


    //int[] temp = {1};

    public String Fibo(int maxnum) {

        int[] fibonacci = new int[maxnum];
       StringBuffer sb = null;
        sb = new StringBuffer();
        for (int j = 0; j < maxnum; j++) {
            int i = j - 1, k = j - 2;
            if (j <= 1) {
                fibonacci[j] = 1;
            } else {
                fibonacci[j] = fibonacci[i] + fibonacci[k];
            }

            sb.append(fibonacci[j]);
            sb.append(" ");
            }
        return String.valueOf(sb);
    }
}
