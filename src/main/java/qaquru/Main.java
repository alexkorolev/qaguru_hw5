package qaquru;

public class Main {
    public static void main(String args[]){
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long l = 0x7fff_ffff_ffff_ffffL;
        float e = 214748364799999999999999999999999999999.9F;
        double d = 214748364799999999999999999999999999999.9F;
        boolean f = false;

    for (int i = 0; i <= 1 ; i ++) {
        if (f == true) {
            int secondHw = 1;
            double forSecondHw = 1.1;
            System.out.println("Операции int и double");
            System.out.println("Сумма int + double " + (secondHw + forSecondHw));
            System.out.println("Разность int - double " + (secondHw - forSecondHw));
            System.out.println("Деление int / double " + (secondHw / forSecondHw));
            System.out.println("Деление с остаком int % double " + (secondHw % forSecondHw) + "\n");
        } else {
            System.out.println("Логические операции");
            System.out.println("byte > short? " + (a > b));
            System.out.println("short < int? " + (b < c));
            System.out.println("int == long? " + (c == l));
            System.out.println("long != float " + (l != e) + "\n" );

            a++;
            b++;
            c++;
            d++;
            e++;
            l++;
            System.out.println("Попытки переполнения");
            System.out.println("Попытка переполнения a byte = " + a);
            System.out.println("Попытка переполнения b short = " + b);
            System.out.println("Попытка переполнения с int = " + c);
            System.out.println("Попытка переполнения l long = " + l);
            System.out.println("Вывести e float = " + e);
            System.out.println("Вывести d double = " + d + "\n");

            f = true;
        }
    }
    }
}
