package com.ml.TM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ejercicio que desea ejecutar (1,2,3,4 o 5): ");
        int ejercicio = scanner.nextInt();

        switch (ejercicio) {
            case 1: {
                System.out.println("------------------------------------------------");
                System.out.println("Ejercicio 1:");
                System.out.println("Ingrese la cantidad de números pares que desea: ");
                int cantNumPares = scanner.nextInt();
                mostrarNumerosPares(cantNumPares);
                break;
            }
            case 2: {
                System.out.println("------------------------------------------------");
                System.out.println("Ejercicio 2:");
                System.out.println("Ingrese un número: ");
                int numero = scanner.nextInt();
                System.out.println("Ingrese la cantidad de múltiplos que desea del número " + numero + ": ");
                int cantidadMultiplo = scanner.nextInt();
                mostrarMúltiplosDeNumero(numero, cantidadMultiplo);
                break;
            }
            case 3: {
                System.out.println("------------------------------------------------");
                System.out.println("Ejercicio 3:");
                System.out.println("Ingrese un número para ver si es primo:");
                int num = scanner.nextInt();
                System.out.println("El numero " + num + (esPrimo(num) ? " es primo." : " no es primo."));
                break;
            }
            case 4:{
                System.out.println("------------------------------------------------");
                System.out.println("Ejercicio 4:");
                System.out.println("Ingrese la cantidad de números primos que quiere ver:");
                int cantPrimos = scanner.nextInt();
                primerosNPrimos(cantPrimos);
                break;
            }
            case 5:{
                System.out.println("------------------------------------------------");
                System.out.println("Ejercicio 5:");
                System.out.println("Ingrese la cantidad de números:");
                int cantNumeros = scanner.nextInt();
                System.out.println("Ingrese la cantidad de digitos:");
                int cantDigitos = scanner.nextInt();
                System.out.println("Ingrese el digito:");
                int digito = scanner.nextInt();
                primerosNConMDigitosD(cantNumeros,cantDigitos,digito);
                break;
            }
        }
    }

    private static void ejecutarEjercicio1(){

    }

    /**
     * Muestra los números pares desde 0 a N, siendo N la cantidad ingresada como parámetro
     * @param  cantNumPares  cantidad de números pares que se desean mostrar
     */

    public static void mostrarNumerosPares(int cantNumPares){
        int contador = 1;
        int numeroPar=0;

        while(contador<=cantNumPares){
            System.out.println(numeroPar);
            numeroPar+=2;
            contador++;
        }
    }

    /**
     * Muestra los múltiplos de un número desde 0 a N, siendo N la cantidad de múltiplos que se desean mostrar
     * @param  numero  número del que se desea obtener los múltiplos
     * @param  cantidadMultiplo cantidad de múltiplos que se desean mostrar
     */

    public static void mostrarMúltiplosDeNumero(int numero, int cantidadMultiplo){
        int index=0;
        int acum=0;

        while(index<cantidadMultiplo){
            System.out.println(acum);
            acum+=numero;
            index++;
        }
    }

    /**
     * Devuelve verdadero si el número como parámetro es Primo
     *
     * @param  numero  numero que se desea saber si es primo o no
     * @return      Boolean
     */

    public static Boolean esPrimo(int numero){
        int contador = 2;
        boolean esPrimo = true;

        while(contador < numero ){

            if(numero%contador==0){
                esPrimo = false;
            }
            contador++;
        }
        return esPrimo;
    }

    /**
     * Muestra los números primos desde 0 hasta N, siendo N la cantidad de primos que se desean mostrar
     *
     * @param  cantPrimos  cantidad de primos que se desean mostrar
     */

    public static void primerosNPrimos(int cantPrimos){
        int numero = 0;
        int contador = 1;

        while(contador <= cantPrimos){
            if(esPrimo(numero)){
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    /**
     * Muestra los primeros números que tengan la cantidad de digitos con el numero de digito ingresados como parametros
     *
     * @param  cantidadPrimerosNumeros  cantidad de primeros numeros que se quieren mostrar
     * @param cantidadDigitos cantidad de digitos del digito ingresado como parametro que el numero debe tener
     * @param numeroDigito digito que se repetira dentro del numero
     */

    public static void primerosNConMDigitosD(int cantidadPrimerosNumeros, int cantidadDigitos, int numeroDigito ){
        int index = 1;
        Integer numero = obtenerPrimerNumero(cantidadDigitos,numeroDigito);

        while(index < cantidadPrimerosNumeros) {
            numero++;
            if(numeroTieneMDigitosD(numero,cantidadDigitos,numeroDigito)){
                System.out.println(numero);
                index++;
            }
        }
    }

    /**
     * Obtiene el primero numero que aparece con la cantidad de digitos del digito pasado como parametros
     * De esta manera reducimos la busqueda for
     *
     * @param  cantidadDigitos  cantidad de digitos que el numero tiene de numeroDigito
     * @param numeroDigito digito que se repite dentro del numero
     * @return Integer
     */

    public static Integer obtenerPrimerNumero(int cantidadDigitos, int numeroDigito){
        String digito = Integer.toString(numeroDigito);
        String primerNumero = digito;

        for (int i = 1; i < cantidadDigitos; i++) {
            primerNumero += digito;
        }
        System.out.println(primerNumero);
        return Integer.parseInt(primerNumero);
    }

    /**
     * Chequea si el numero posee la cantidad de digitos del digito pasados como parametro
     *
     * @param  numero  numero a verificar
     * @param cantidadDigitos cantidad de digitos de numeroDigito que debe tener
     * @param numeroDigito digito que se debe repetir en el numero
     * @return Boolean
     */

    public static Boolean numeroTieneMDigitosD(int numero, int cantidadDigitos, int numeroDigito){
        Boolean cumpleCondicion = false;
        String num = Integer.toString(numero);
        char[] arrDigitos= num.toCharArray();
        int contador=0;

        for (char digito: arrDigitos) {

            if(Character.getNumericValue(digito)==numeroDigito){
                contador++; }
        }
        if(contador==cantidadDigitos){
            cumpleCondicion = true;
        }

        return cumpleCondicion;
    }
}
