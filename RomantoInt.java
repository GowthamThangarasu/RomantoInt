/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romantoint;

/**
 *
 * @author StarHP
 */
public class RomantoInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
    int times = 0,num=0;
    String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
            "XC", "C", "CD", "D", "CM", "M" };
    int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
            900, 1000 };
    for (int i = ints.length - 1; i >= 0; i--) {
        times = num / ints[i];
        num %= ints[i];
        while (times > 0) {
            sb.append(romans[i]);
            times--;
            System.out.println(""+sb.toString());
        }
    }
    }
    
}
