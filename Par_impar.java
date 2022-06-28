import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Par_impar {

    static List<Persona> personaList = new ArrayList<>();

    public static void main(String[] args) {

        ejercicio_1();
        ejercicio_2();
        ejercicio_3();

    }

    public static void ejercicio_1() {

        // Lee un número y comprueba par o impar.

        System.out.println("Introduzca un número entero:");

        try (Scanner sc = new Scanner(System.in)) {
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                for (int i = numero; i >= 0; i = i - 2) {
                    System.out.println(i);
                }
            } else {
                for (int i = numero; i > 0; i = i - 2) {
                    System.out.println(i);
                }
            }
        }
    }

    // Algoritmo de salario

    public static void ejercicio_3() {

        try (Scanner sc = new Scanner(System.in)) {

            double horasTrabajadas;
            double tarifaPorHora;
            double sueldo;
            double horasExtras;
            double tarifaPorHoraExtra;
            double precioHorasExtras;
            double precioHorasTrabajadas;

            System.out.println("Introduzca el número de horas trabajadas:");
            horasTrabajadas = sc.nextDouble();
            System.out.println("Introduzca la tarifa, puede ser decimal con comas:");
            tarifaPorHora = sc.nextDouble();

            if (horasTrabajadas <= 40) {
                sueldo = horasTrabajadas * tarifaPorHora;
                System.out.println(sueldo + " euros.");

            } else {

                horasExtras = horasTrabajadas - 40;
                double cincuentaPorCiento = tarifaPorHora / 2;
                tarifaPorHoraExtra = cincuentaPorCiento + tarifaPorHora;

                precioHorasExtras = tarifaPorHoraExtra * horasExtras;
                precioHorasTrabajadas = tarifaPorHora * 40;

                sueldo = precioHorasExtras + precioHorasTrabajadas;

                System.out.println(sueldo + " euros.");

            }
        }
    }

    public static void ejercicio_2() {

        LEER_PERSONAS();

        int totalMujeres = 0;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        int masculinoMayordeEdad = 0;
        int femeninoMenorDeEdad = 0;

        for (Persona persona : personaList) {
            if (persona.getEdad() >= 18) {
                mayoresDeEdad++;
                if (persona.getSexo() == 'H') {
                    masculinoMayordeEdad++;
                } else {
                    totalMujeres++;
                }
            } else {
                menoresDeEdad++;
                if (persona.getSexo() == 'M') {
                    femeninoMenorDeEdad++;
                    totalMujeres++;
                }
            }
        }

        float porcentajeMayoresDeEdad = mayoresDeEdad * 100 / personaList.size();

        float porcentajeMujeres = totalMujeres * 100 / personaList.size();

        System.out.println(mayoresDeEdad + " personas mayores de edad. ");
        System.out.println(menoresDeEdad + " personas menores de edad");
        System.out.println(masculinoMayordeEdad + " cantidad de personas masculinas mayores de edad.");
        System.out.println(femeninoMenorDeEdad + " cantidad de personas femeninas menores de edad.");

        System.out.println(porcentajeMayoresDeEdad + "%" + "  porcentaje de personas mayores de edad.");
        System.out.println(porcentajeMujeres + "%" + " porcentaje de mujeres.");

    }

    private static void LEER_PERSONAS() {

        personaList.add(new Persona(75, 'M'));
        personaList.add(new Persona(68, 'M'));
        personaList.add(new Persona(0, 'H'));
        personaList.add(new Persona(70, 'H'));
        personaList.add(new Persona(80, 'H'));
        personaList.add(new Persona(44, 'M'));
        personaList.add(new Persona(52, 'M'));
        personaList.add(new Persona(2, 'M'));
        personaList.add(new Persona(31, 'M'));
        personaList.add(new Persona(2, 'H'));
        personaList.add(new Persona(66, 'H'));
        personaList.add(new Persona(25, 'M'));
        personaList.add(new Persona(50, 'M'));
        personaList.add(new Persona(58, 'M'));
        personaList.add(new Persona(59, 'M'));
        personaList.add(new Persona(0, 'M'));
        personaList.add(new Persona(45, 'H'));
        personaList.add(new Persona(44, 'H'));
        personaList.add(new Persona(62, 'H'));
        personaList.add(new Persona(16, 'M'));
        personaList.add(new Persona(6, 'H'));
        personaList.add(new Persona(6, 'H'));
        personaList.add(new Persona(60, 'H'));
        personaList.add(new Persona(50, 'M'));
        personaList.add(new Persona(17, 'M'));
        personaList.add(new Persona(59, 'H'));
        personaList.add(new Persona(31, 'H'));
        personaList.add(new Persona(19, 'M'));
        personaList.add(new Persona(74, 'H'));
        personaList.add(new Persona(10, 'H'));
        personaList.add(new Persona(0, 'H'));
        personaList.add(new Persona(60, 'H'));
        personaList.add(new Persona(71, 'H'));
        personaList.add(new Persona(73, 'H'));
        personaList.add(new Persona(19, 'H'));
        personaList.add(new Persona(59, 'H'));
        personaList.add(new Persona(29, 'H'));
        personaList.add(new Persona(7, 'H'));
        personaList.add(new Persona(14, 'H'));
        personaList.add(new Persona(28, 'H'));
        personaList.add(new Persona(74, 'H'));
        personaList.add(new Persona(9, 'H'));
        personaList.add(new Persona(80, 'M'));
        personaList.add(new Persona(24, 'H'));
        personaList.add(new Persona(5, 'H'));
        personaList.add(new Persona(12, 'M'));
        personaList.add(new Persona(31, 'H'));
        personaList.add(new Persona(60, 'M'));
        personaList.add(new Persona(42, 'M'));
        personaList.add(new Persona(39, 'H'));
    }
}
