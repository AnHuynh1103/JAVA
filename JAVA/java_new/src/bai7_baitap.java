public class bai7_baitap {
    public static void main(String[] args) {
        byte i1 = 2, i2 = 5, i3 = -3;
        float d1 = 2f, d2 = 5f, d3 = -0.5f;

        System.out.println("i1 = "+i1);
        System.out.println("i2 = "+i2);
        System.out.println("i3 = "+i3);
        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);

        //a) i1 + (i2 * i3)
        System.out.println("i1 + (i2 * i3): "+(i1 + (i2*i3)));
        System.out.println();

        //b) i1 * (i2 + i3)
        System.out.println("i1 * (i2 + i3): "+(i1 * (i2+i3)));
        System.out.println();

        //c) i1 /(i2 + i3)
        System.out.println("i1 / (i2 + i3): "+((float)i1/(i2+i3)));
        System.out.println();

        //e) i1/ i2 + i3
        System.out.println("i1/ i2 + i3: "+((float)i1/i2+i3));
        System.out.println();

        //g) 3 + 4 + 5/3
        System.out.println("3 + 4 + 5/3: "+(3 + 4 + (float)5/3));
        System.out.println();

        //i) (3 + 4 + 5)/3
        System.out.println("(3 + 4 + 5)/3: "+((float)(3 + 4 + 5)/3));
        System.out.println();

        //k) d1 + (d2*d3)
        System.out.println("d1 + (d2*d3): "+(d1 + (d2*d3)));
        System.out.println();

        //l) d1 + d2 * d3
        System.out.println("d1 + d2 * d3: "+(d1 + d2 * d3));
        System.out.println();

        //m) d1/d2 - d3
        System.out.println("d1/d2 - d3: "+(d1/d2 - d3));
        System.out.println();

        //n) d1/(d2 - d3)
        System.out.println("d1/(d2 - d3): " +(d1/(d2 - d3)));
        System.out.println();

        //o) d1 + d2 + d3/3
        System.out.println("d1 + d2 + d3/3: "+(d1 + d2 + d3/3));
        System.out.println();

        //p) (d1 + d2 + d3)/3
        System.out.println("(d1 + d2 + d3)/3 :"+((d1 + d2 + d3)/3));
        System.out.println();

        //q) d1 + d2 + (d3/3)
        System.out.println("d1 + d2 + (d3/3): "+(d1 + d2 + (d3/3)));
        System.out.println();

        //r) 3*(d1+d2)*(d1-d3)
        System.out.println("3*(d1+d2)*(d1-d3): "+(3*(d1+d2)*(d1-d3)));
        System.out.println();

    }
}