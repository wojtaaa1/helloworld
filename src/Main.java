import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /**
     * Komentář k metodě main.
     * @param args
     */
    public static void main(String[] args) {
        printingnames();

        printNumbers1To5();

        triangle();

    }

    private static void triangle() {
        double a = 3.5;
        double b = 4.5;
        System.out.println("Úhlopříčka trojúhelníku je: "+calculateDiagonal(a, b));

        double c;
        c = calculateDiagonal(a = 5, b = 6);
        System.out.println("Úhlopříčka trojúhelníku je: "+c);
    }

    private static void printingnames() {
        System.out.println("Hello and welcome!");
        System.out.println("I wrote my first code in Java"); // sout
        System.out.println("I wrote my first code in Java"); // Command - D

        String name = "Karel Dvořák";
        LocalDate date = LocalDate.now(); //musím naimportovat
        date = LocalDate.of(2022, 12, 1);
        System.out.println(date);

        
    }

    private static void printNumbers1To5() {
        for (int i = 1; i <= 5; i++) { // zopakuj 5x kód v těle cyklu
            System.out.println("i = " + i);
        }
    }
    private static double calculateDiagonal (double a, double b) {
        return Math.sqrt(a * a + b * b); // výpočet délky úhlopříčky obdélníku


    }
}