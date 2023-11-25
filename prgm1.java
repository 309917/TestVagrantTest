import java.util.Arrays;
public class prgm1 {
    public static void main(String[] args) {
        String[] product ={"Leather wallet","Umbrella","Cigarette","Honey"};
        double[] unit_price={1100,900,200,100};
        double[] gst={0.18,0.12,0.28,0.0};
        int[] quantity={1,4,3,2};
        int[] maximum=new double[4];

        maximum[0]=(unit_price[0] + (unit_price[0]*gst[0]))*quantity[0];
        maximum[1]=(unit_price[1] + (unit_price[1]*gst[1]))*quantity[1];


        Arrays.sort(maximum);

        System.out.println(product[1] + "\t" + " gst amount" + "\t" + maximum[0]);

    }
}
