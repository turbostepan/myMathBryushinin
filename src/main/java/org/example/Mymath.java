package org.example;

public class Mymath {
    public static final double PI = 3.1415926535;
    public static final double E = 2.71828;

    public int minus (int number){
        return - number;

    }
public double minus(double number){
        return - number;

}

public float minus(float number){
        return - number;
}
 public long minus(long number) {
        return - number;
 }
public double cot (int angle){
        return 0;

}
public double arktg(int angle){
        return 0;
}
public double roundl (int start, int end){
    return 0;

    }



    public double sqrt(double number){
    double tg;
    double sqrr = number / 2;
    do {
        tg = sqrr;
        sqrr = (tg + (number / tg)) / 2;
    }
    while ((tg-sqrr)!=0);
return sqrr;
    }
    }


