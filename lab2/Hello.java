package lab2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        problema2();
    }

    public static void problema2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce valorea: ");
        int n = in.nextInt();
        int s = 0;
        int p = 1;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                s=s+i;
            }
            else{
                p=p*i;
            }
        }
        System.out.println("Suma numerelor este: " + s);
        System.out.println("Produsul numerelor este: " + p);
    }
}
