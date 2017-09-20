package com.timbuchalka;

import java.util.function.DoubleToLongFunction;

public class Main {

    public static void main(String[] args) {
        /*int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println("Previous Result: " + previousResult + " New Result: " + result);
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println("Previous Result: " + previousResult + " New Result: " + result);
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println("Previous Result: " + previousResult + " New Result: " + result);
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println("Previous Result: " + previousResult + " New Result: " + result);
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now = " + result);
        result++;
        System.out.println("Result is now = " + result);
        result--;
        System.out.println("Result is now = " + result);
        result += 2;
        System.out.println("Result is now = " + result);
        result *= 10;
        System.out.println("Result is now = " + result);
        result -= 10;
        System.out.println("Result is now = " + result);
        result /= 10;
        System.out.println("Result is now = " + result);

        //Sistema de Atribuicao Boolean Equals "==".
        boolean isAlien = false;//True nao ira funcionar porque a variavel "isAlien" ja esta definida para ser False.
        if (isAlien == true)
            System.out.println("It's an Alien");
        if (isAlien == true)
            System.out.println("It's not an Alien");

        int topScore = 80;

        //if(topScore > 100)
        //System.out.println("Very well");

        int secondScore = 85;
        if ((topScore > secondScore) && (topScore < 100))
            System.out.println("Greater than Second Top Score and Less then 100");
        if ((topScore > 90) || (secondScore <= 90))
            System.out.println("One of these tests is true");
        int newValue = 50;

        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to Happen");*/

        //Create a DOUBLE variable with the value 20
        //Create a second variable with the value 80
        //Add both numbers up and  multiply by 25
        //Use the Remainder Operator to figure out the remainder from the sum of #3 divided by 40
        //write an "if" statement that displays a message "Total Was over the limit"
        //If the remaining total (4#) is equal to 20 or less

        double firstValue = 20;
        double secondValue = 80;
        double totalValue = (firstValue + secondValue) * 25;
        System.out.println("My Total Is: " + totalValue);
        double theRemainder = totalValue % 40;
        System.out.println("My Remainder Value Is: " + theRemainder);
        if (theRemainder <= 20)
            System.out.println("Total Was over the limit");

    }
}
