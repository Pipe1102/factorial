package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int abc;
        int factA,factB,factC;
        for(int a=1;a<10;a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    abc=(100*a)+(10*b)+c;
                    factA=getFact(a);
                    factB=getFact(b);
                    factC=getFact(c);
                    if(abc==(factA+factB+factC)){
                        System.out.println(abc);
                    }
                }
            }
        }




    }
    public static int getFact(int number){
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
