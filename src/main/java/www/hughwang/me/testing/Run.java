package www.hughwang.me.testing;

import org.junit.Test;
import www.hughwang.me.utils.L;

/**
 * Created by wanghuan on 2017/7/27.
 */
public class Run {

    @Test
    public void run(){
        //$GNRMC,084527.000,A,3107.375789,N,12116.229107,E,0.00,90.72,270717,,,D*49


        //31.742981666666665
        //121.64851166666666

        //31.122928333333334
        //121.270485

        String la = "3107.375789";
        String lo = "12116.229107";

        String[] las = la.split("\\.");
        L.d("las[0] : " + las[0]);
        L.d("las[1] : " + las[1]);
        String la_x = las[0].substring(0,las[0].length()-2);
        String la_y = las[0].substring(las[0].length()-2 , 4);
        String la_z = las[1].substring(0,4);
        L.d("la_x : " + la_x);
        L.d("la_y : " + la_y);
        L.d("la_z : " + la_z);

        double laDouble = Double.parseDouble(la_x) + Double.parseDouble(la_y)/60.0D + Double.parseDouble(la_z)/600000.0D;
        L.d("经度 ： " + laDouble);

        String[] los = lo.split("\\.");
        L.d("los[0] : " + los[0]);
        L.d("los[1] : " + los[1]);
        String lo_x = los[0].substring(0,los[0].length()-2);
        String lo_y = los[0].substring(los[0].length()-2 , 5);
        String lo_z = los[1].substring(0,4);
        L.d("lo_x : " + lo_x);
        L.d("lo_y : " + lo_y);
        L.d("lo_z : " + lo_z);

        double loDouble = Double.parseDouble(lo_x) + Double.parseDouble(lo_y)/60.0D + Double.parseDouble(lo_z)/600000.0D;
        L.d("纬度 ： " + loDouble);


        double latitude = Double.parseDouble(la);
        double a = latitude/100;
        double b = latitude - ((int)a) * 100;
        double c = (b - (int)b) * 60;
        L.d("latitude : " + latitude);
        L.d("a = " + a);
        L.d("b = " + b);
        L.d("c = " + c);
        double m = a + b/60 + c/3600;
        L.d("m => " + m);
        //31.202950856666675


        double longitude = Double.parseDouble(lo);
        double x = longitude/100;
        double y = longitude - ((int)x) * 100;
        double z = (y - (int)y) * 60;
        L.d("longitude : " + longitude);
        L.d("x = " + x);
        L.d("y = " + y);
        L.d("z = " + z);
        double n = x + y/60 + z/3600;
        L.d("n => " + n);

    }

}
