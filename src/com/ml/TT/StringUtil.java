package com.ml.TT;

import java.util.ArrayList;

public class StringUtil {

    public static String[] convertirArrayIntAString(int iArr[]){
        String sArr[] = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            String sNum = Integer.toString(iArr[i]);
            sArr[i]= sNum;
        }
        return sArr;
    }

    public static String[] obtenerArrayConDigitosDeIgualLongitud(String[] sArr, int maxCantDigitos){
        String[] arrConCeros = new String[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            arrConCeros[i] = sumarCerosANumero(maxCantDigitos,sArr[i]);
        }
        return arrConCeros;
    }

    public static int obtenerNumeroConMasDigitos(String[] sArr){
        int maxCantDigitos = 0;
        for (int i = 0; i < sArr.length; i++) {
            int cantDigitos= sArr[i].length();
            if(cantDigitos>maxCantDigitos){
                maxCantDigitos=cantDigitos;
            }
        }
        return maxCantDigitos;
    }

    private static String sumarCerosANumero(int maxCantDigitos, String numero){
        int cantCeros = maxCantDigitos - numero.length();
        String ceros = "";
        for (int i = 0; i < cantCeros; i++) {
            ceros+="0";
        }
        return ceros.concat(numero);
    }

    public static String[] ordenarArrPorDigito(String[] sArr, int digito){
        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();

        for (String numero: sArr) {
            char ultimoDigito = numero.charAt(digito);
            switch (Character.getNumericValue(ultimoDigito)){
                case 0: {
                    L0.add(numero);
                    break;
                }
                case 1: {
                    L1.add(numero);
                    break;
                }
                case 2: {
                    L2.add(numero);
                    break;
                }
                case 3: {
                    L3.add(numero);
                    break;
                }
                case 4: {
                    L4.add(numero);
                    break;
                }
                case 5: {
                    L5.add(numero);
                    break;
                }
                case 6: {
                    L6.add(numero);
                    break;
                }
                case 7: {
                    L7.add(numero);
                    break;
                }
                case 8: {
                    L8.add(numero);
                    break;
                }
                case 9: {
                    L9.add(numero);
                    break;
                }
            }
        }

        L0.addAll(L1);
        L0.addAll(L2);
        L0.addAll(L3);
        L0.addAll(L4);
        L0.addAll(L5);
        L0.addAll(L6);
        L0.addAll(L7);
        L0.addAll(L8);
        L0.addAll(L9);

        return L0.toArray(new String[L0.size()]);
    }
}
