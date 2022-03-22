package topic3;

import java.sql.SQLOutput;

public class Operations {
    static void printAritmeticOperations(int a, int b) {

        System.out.println("Adunarea:" + (a + b));
        System.out.println("Scaderea:" + (a - b));
        System.out.println("Inmultirea:" + (a * b));
        System.out.println("Impartirea:" + (a / b));
        System.out.println("Restul impartirii:" + (a % b));
    }

    static void printLogicOperations(boolean a, boolean b) {

        System.out.println("And:" + (a && b));
        System.out.println("Or:" + (a || b));
        System.out.println("Negation:" + (!a));

    }

    static void printRelationarOperations(int a, int b) {

        System.out.println("Egalitate:" + (a == b));
        System.out.println("Diferenta:" + (a != b));

    }

    static void useForAndWhile() {

        int index = 10;
        int limita = 100;

        while (index <= limita) {
            System.out.print(index + " ");
            index++;
        }
        System.out.println("Valoarea lui index la finalul executiei while este 101" );
        }

    }
