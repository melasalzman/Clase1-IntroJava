package com.ml.TT;

public class Main {


    public static String[] radixSort(int []arr) {
        StringUtil stringUtil = new StringUtil();
        String[] sArr = stringUtil.convertirArrayIntAString(arr);
        int maxCantDigitos = stringUtil.obtenerNumeroConMasDigitos(sArr);
        sArr = stringUtil.obtenerArrayConDigitosDeIgualLongitud(sArr,maxCantDigitos);

        for (int digito = maxCantDigitos-1; digito >= 0; digito--) {
            sArr = stringUtil.ordenarArrPorDigito(sArr,digito);
        }

        return sArr;
    }

    public static void main(String[] args) {

        System.out.println("Array sin ordenar: ");
        int arr[]={3, 673, 106, 45, 2,23 };
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("------------------------");

        System.out.println("Array ordenado: ");
        String[] sArr = radixSort(arr);
        for(String i:sArr){
            System.out.println(i);
        }
    }
}
