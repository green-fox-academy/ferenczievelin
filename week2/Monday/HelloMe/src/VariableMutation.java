public class VariableMutation {

    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a+=10;


        System.out.println(a);




        int b = 100;
        // make it smaller by 7
        b-=7;


        System.out.println(b);




        int c = 44;
        // please double c's value
        c*=2;


        System.out.println(c);




        int d = 125;
        // please divide by 5 d's value
        d/=5;


        System.out.println(d);




        double e = 8;
        // please cube of e's value
        e=Math.pow(e,3);


        System.out.println(e);




        int f1 = 123;
        int f2 = 345;
        boolean big=false;
        // tell if f1 is bigger than f2 (print as a boolean)

        if (f1>f2) {
            big=true;
        }
        System.out.println(big);


        int g1 = 350;
        int g2 = 200;
        boolean g22bigger=false;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        if ((g2*2)>g1){
            g22bigger=true;
        }
        System.out.println(g22bigger);


        int h = 135798745;
        boolean div11 =false;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h%11==0){
            div11=true;
        }
        System.out.println(div11);


        int i1 = 10;
        int i2 = 3;
        boolean higher=false;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if (i1>(i2*i2) && i1 < (i2*i2*i2))
        {higher=true;}
        System.out.println(higher);


        int j = 1521;
        boolean div35 =false;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j%3==0 || j%5==0)
        {div35=true;}
        System.out.println(div35);


        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        for (int i = 0; i < 2; i++) {
            k=k+k;

        }


        System.out.println(k);
    }
}

