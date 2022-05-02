

package bebiemainjava;

import java.util.Scanner;

public class Receipt {
    static final double TSHIRT_PRICE = 16.1075;
    static final double CHIPS_PRICE = 1.5215;
    static final double COKE_PRICE = 2.99;
    String a;
    static int numberShirts;
    static int numberChips;
    static int numberCoke;
    static double tshirtTotal = TSHIRT_PRICE * numberShirts;
    static double chipsTotal = CHIPS_PRICE * numberChips;
    static double cokeTotal = (COKE_PRICE + 1.20) * numberCoke;
    static double finalTotal = tshirtTotal + chipsTotal + cokeTotal;

    }


