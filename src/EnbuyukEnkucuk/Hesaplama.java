package EnbuyukEnkucuk;

import java.util.Scanner;

public class Hesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y, z, t;
        System.out.println("4 adet sayi giriniz !");

        System.out.print("1. sayiyi giriniz: ");
        x = input.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        y = input.nextInt();
        System.out.print("3. sayiyi giriniz: ");
        z = input.nextInt();
        System.out.print("4. sayiyi giriniz: ");
        t = input.nextInt();

        if (x > y && x > z && x > t) {
            if (y > z && y > t) {
                if (z > t) {
                    System.out.println("x>y>z>t");
                    System.out.println("En buyuk: " + x);
                    System.out.println("En kucuk: " + t);
                } else {
                    System.out.println("x>y>t>z");
                    System.out.println("En buyuk: " + x);
                    System.out.println("En kucuk: " + z);
                }
            } else if (z > y && z > t) {
                if (y > t) {
                    System.out.println("x>z>y>t");
                    System.out.println("En buyuk: " + x);
                    System.out.println("En kucuk: " + t);
                } else {
                    System.out.println("x>z>t>y");
                    System.out.println("En buyuk: " + x);
                    System.out.println("En kucuk: " + t);
                }
            } else if (t > z && t > y) {
                if (z > y) {
                    System.out.println("x>t>z>y");
                    System.out.println("En buyuk: " + x);
                    System.out.println("En kucuk: " + y);
                } else {
                    System.out.println("x>t>y>z");
                    System.out.println("En buyuk: " + x);
                    System.out.println("En kucuk: " + z);
                }
            }
        } else if (y > x && y > z && y > t) {
            if (x > z && x > t) {
                if (z > t) {
                    System.out.println("y>x>z>t");
                    System.out.println("En buyuk: " + y);
                    System.out.println("En kucuk: " + t);
                } else {
                    System.out.println("y>x>t>z");
                    System.out.println("En buyuk: " + y);
                    System.out.println("En kucuk: " + z);
                }
            } else if (z > x && z > t) {
                if (x > t) {
                    System.out.println("y>z>x>t");
                    System.out.println("En buyuk: " + y);
                    System.out.println("En kucuk: " + t);
                } else {
                    System.out.println("y>z>t>x");
                    System.out.println("En buyuk: " + y);
                    System.out.println("En kucuk: " + x);
                }
            } else if (t > x && t > z) {
                if (x > z) {
                    System.out.println("y>t>x>z");
                    System.out.println("En buyuk: " + y);
                    System.out.println("En kucuk: " + z);
                } else {
                    System.out.println("y>t>z>x");
                    System.out.println("En buyuk: " + y);
                    System.out.println("En kucuk: " + x);
                }
            }
        } else if (z > x && z > y && z > t) {
            if (x > y && x > t) {
                if (y > t) {
                    System.out.println("z>x>y>t");
                    System.out.println("En buyuk: " + z);
                    System.out.println("En kucuk: " + t);
                } else {
                    System.out.println("z>x>t>y");
                    System.out.println("En buyuk: " + z);
                    System.out.println("En kucuk: " + y);
                }
            } else if (y > x && y > t) {
                if (x > t) {
                    System.out.println("z>y>x>t");
                    System.out.println("En buyuk: " + z);
                    System.out.println("En kucuk: " + t);
                } else {
                    System.out.println("z>y>t>x");
                    System.out.println("En buyuk: " + z);
                    System.out.println("En kucuk: " + x);
                }
            } else if (t > x && t > y) {
                if (x > y) {
                    System.out.println("z>t>x>y");
                    System.out.println("En buyuk: " + z);
                    System.out.println("En kucuk: " + y);
                } else {
                    System.out.println("z>t>y>x");
                    System.out.println("En buyuk: " + z);
                    System.out.println("En kucuk: " + x);
                }
            }
        } else if (t > x && t > y && t > z) {
            if (x > y && x > z) {
                if (y > z) {
                    System.out.println("t>x>y>z");
                    System.out.println("En buyuk: " + t);
                    System.out.println("En kucuk: " + z);
                } else {
                    System.out.println("z>x>t>y");
                    System.out.println("En buyuk: " + t);
                    System.out.println("En kucuk: " + y);
                }
            } else if (y > x && y > z) {
                if (x > z) {
                    System.out.println("t>y>x>z");
                    System.out.println("En buyuk: " + t);
                    System.out.println("En kucuk: " + z);
                } else {
                    System.out.println("t>y>z>x");
                    System.out.println("En buyuk: " + t);
                    System.out.println("En kucuk: " + x);
                }
            } else if (z > x && z > y) {
                if (x > y) {
                    System.out.println("z>t>x>y");
                    System.out.println("En buyuk: " + t);
                    System.out.println("En kucuk: " + y);
                } else {
                    System.out.println("t>z>y>x");
                    System.out.println("En buyuk: " + t);
                    System.out.println("En kucuk: " + x);
                }
            }
        }
    }
}
