/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marlom;

import javax.swing.JOptionPane;

/**
 *
 * @author u08513605131
 */
public class Expo {

    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Resultado: " + expo(4,3));
    }

    public static int expo(int x, int n) {
        if (n != 0) {
            return x * expo(x, n - 1);
        } else {
            return 1;
        }

    }
}
