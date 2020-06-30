package com.zero.studeyTest;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String args[]) {

/*        int a= '0';
        System.out.println(1+a);*/
        String [][] s = {
                {"1, A, 91"},
                {"2, B, 64"},
                {"3, C, 89"},
                {"4, A, 89"},
                {"5, C, 95"},
        };
        String [][] s2 = new String[10][];
        int low = s.length;
        
        System.out.println(s2.length);
        for(int i = 0 ;i<low;i++){
            
            int samenum = 1;
            double studentgrade = Double.valueOf(s[i][2]);
            for (int j = i+1;j<low;j++){
                if (s[i][1].equals(s[j][1])){
                    studentgrade+= Double.valueOf(s[j][2]);
                    samenum = samenum + 1;
                }
            }
            double averge = studentgrade/samenum;


            for (int j = 0;j<s[i].length;j++){

            }
        }


    }
}
