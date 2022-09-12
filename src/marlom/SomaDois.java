/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marlom;

import java.util.Scanner;

/**
 *
 * @author u08513605131
 */
public class SomaDois {

    public static int somaDois(int x, int y) {
        if (x == y) {
            return x;
        } else {
            return x + somaDois(x - 1, y);
        }
    }

    public static void main(String[] args) {
        int x = 13;
        int y = 10;

        int result = somaDois(x, y);

        System.out.println(result);

    }

}
