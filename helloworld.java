package com.company;

public class helloworld { // są 3 możliwości: public, private, protected, -

    public static void main(String[] args){ // static to znaczy, że dostępne dla wszystkich
        int i = 9;
        long ageOfUniverse = 934802049810984L;
        float a = 8.9f;
        double b = 8.9;
        char c = 'a';
        boolean isJavaFun = true;


        int f = 6;
        int g= 4;
        double k =  f/(double)g;


        String name = "Agata";


        int[] tablica = {1, 2, 3};
        double[] tablica1 = new double [10];


        int[][] q = new int[3][];
        q[0] = new int [5];
        q[1] = new int [3];
        q[2] = new int[2];

        System.out.println( f==g);
        System.out.println(true && false);
        System.out.println(!(true || false));
        System.out.print(tablica[1]);

    }
}
