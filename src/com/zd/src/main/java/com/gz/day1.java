package com.gz;



import java.util.ArrayList;
import java.util.List;

public class day1 {
    //给出两个整数 a 和 b , 求他们的和,不准使用+符号
    public static  void main(String[] args) {
        /*int a = 10;
        String str = Integer.toBinaryString(a);
        System.out.println(str);
        int b = 27;
        String str1 = Integer.toBinaryString(b);
        System.out.println(str1);
        for(int i =0 ; i<str.length();i++){
          for (int y = 0;y<str1.length();y++){
              if(i==y){
                  System.out.println(str.charAt(i)+str1.charAt(y));
              }
          }
          if (str.length()>str1.length()) {
              System.out.println(str.charAt(i));
          }else{
              System.out.println();
          }
            }
        }*/
        System.out.println(addTwoSum(16,27));
    }
    public static int addTwoSum(int a, int b){
        while(b!=0){
            int _a = a ^ b;
            int _b = (a&b)<<1;
            a = _a;
            b = _b;
        }
        //System.out.println(a);
        return a;
    }
    }

