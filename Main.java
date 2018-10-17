package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String co = "";
        double suma = 0;

        while(!co.equals("quit")) {
            System.out.printf("Podaj nazwę figury (kolo, prostokat, kwadrat, trapez, rownoleglobok): ");
            co = input.nextLine();

            if(co.equals("kolo")) {
                kolo ksztalt = new kolo();
                suma += ksztalt.obliczenia();
            }

            else if(co.equals("prostokat")) {
                prostokat ksztalt = new prostokat();
                suma += ksztalt.obliczenia();
            }

            else if(co.equals("kwadrat")) {
                kwadrat ksztalt = new kwadrat();
                suma += ksztalt.obliczenia();
            }

            else if(co.equals("trapez")) {
                trapez ksztalt = new trapez();
                suma += ksztalt.obliczenia();
            }

            else if(co.equals("rownoleglobok")) {
                rownoleglobok ksztalt = new rownoleglobok();
                suma += ksztalt.obliczenia();
            }

            else if(!co.equals("quit")) System.out.println("Nie wiem o co chodzi o_O");

        }
        System.out.printf("Suma: " + suma);
    }

    private static class kolo {
        Scanner input = new Scanner(System.in);
        private double r;

        public double obliczenia() {
            System.out.printf("Podaj promien: ");
            r = input.nextDouble();

            return Math.pow(r, 2) * Math.PI;
        }
    }

    private static class prostokat {
        Scanner input = new Scanner(System.in);
        private double a;
        private double b;

        public double obliczenia() {
            System.out.printf("Podaj pierwszy bok: ");
            a = input.nextDouble();
            System.out.printf("Podaj drugi bok: ");
            b = input.nextDouble();

            return a * b;
        }
    }

    private static class kwadrat {
        Scanner input = new Scanner(System.in);
        private double a;

        public double obliczenia() {
            System.out.printf("Podaj bok: ");
            a = input.nextDouble();

            return Math.pow(a, 2);
        }
    }

    private static class trapez {
        Scanner input = new Scanner(System.in);
        private double a;
        private double b;
        private double h;

        public double obliczenia() {
            System.out.printf("Podaj gorny bok: ");
            a = input.nextDouble();
            System.out.printf("Podaj dolny bok: ");
            b = input.nextDouble();
            System.out.printf("Podaj wysokość: ");
            h = input.nextDouble();

            return ((a + b) * h )/ 2;
        }
    }

    private static class rownoleglobok {
        Scanner input = new Scanner(System.in);
        private double a;
        private double h;

        public double obliczenia() {
            System.out.printf("Podaj górny bok: ");
            a = input.nextDouble();
            System.out.printf("Podaj wysokość: ");
            h = input.nextDouble();

            return a * h;
        }
    }
}
