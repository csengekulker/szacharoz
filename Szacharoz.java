/*
* File: Szacharoz.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-02-21
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Szacharoz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tBalogh Csenge\n\tSzoft_I_N\n\t2022.02.21");
        System.out.println("Szacharóz");

        System.out.print("Széntartalom > ");
        int coal = sc.nextInt();
        System.out.print("Hidrogéntartalom > ");
        int hydrogen = sc.nextInt();
        System.out.print("Oxigéntartalom > ");
        int oxygen = sc.nextInt();

        sc.close();

        if (
            coal % 12 == 0 &&
            hydrogen % 22 == 0 &&
            oxygen % 11 == 0
        ) {
            System.out.println("");
            System.out.println("\tLehet szacharóz");
        } else  {
            System.out.println("");
            System.out.println("\tNem lehet szacharóz");
        }
    }
} 