package fr.afpa.converter.tool;

import java.math.BigInteger;
import java.util.regex.Pattern;

/**
 * Classe utilitaire permettant de passer des nombres d'une base à l'autre.
 * 
 * Base suportées:
 * - binaire
 * - décimale 
 * - hexadécimale
 */
public final class ConverterTool {



    

    /**
     * 


     * Constructeur privé pour cacher celui déclaré par défaut en public.
     */
    private ConverterTool() {}

    /**
     * Convertit un nombre binaire (représentation sous forme de chaîne de
     * caractère) en sa représentation décimale.
     * 
     * @param binary Nombre binaire à traiter
     * @return Répresentation décimale du nombre, -1 si la conversion est impossible
     */
  
    public static int binaryToDecimal(String binary) {
        try {
            // Parse the binary string to decimal integer
            return Integer.parseInt(binary, 2);
        } catch (NumberFormatException e) {
            // Return -1 for invalid binary strings
            return -1;
        }
    }
    

    /**
     * Convertit un nombre décimal en sa représentation binaire.
     * 
     * @param decimal Nombre décimal à traiter
     * @return Répresentation binaire du nombre
     */
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    /**
     * Convertit un nombre binaire (représentation sous forme de chaîne de
     * caractère) en sa représentation héxadécimale.
     * 
     * @param binary Nombre binaire à traiter
     * @return Répresentation héxadécimale du nombre
     */
    public static String binaryToHexadecimal(String binary) {
        try {
            int decimal = Integer.valueOf(binary);
            String hex = Integer.toHexString(decimal);
            return hex;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * Convertit un nombre décimal en sa représentation héxadécimale.
     * 
     * @param decimal Nombre décimal à traiter
     * @return Répresentation binaire du nombre
     */
    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal);
    }

    /**
     * Convertit un nombre hexadécimal en sa représentation décimale.
     * 
     * @param decimal Nombre décimal à traiter
     * @return Répresentation binaire du nombre
     */
    public static int hexadecimalToDecimal(String hexadecimal) {
        return -1;
    }

    public static String hexadecimalToBinary(String hex) {
        return null;
    }

    /**
     * Vérifie si une chaîne de caractères en paramètre représente un nombre
     * hexadécimal
     * 
     * @param toCheck Chaîne à vérifier
     * @return true si la chaîne passée en paramètre contient des symboles
     *         hexadécimaux, faux sinon
     */
   
    public static boolean checkIfHexadecimal(String toCheck) {
         // TODO vérification par l'utilisation d'une REGEX
        return Pattern.matches("^[0-9A-Fa-f]+$", toCheck);
    }
    
    /**
     * Vérifie si une chaîne de caractères en paramètre représente un nombre entier
     * 
     * @param toCheck Chaîne à vérifier
     * @return true si la chaîne passée en paramètre contient des symboles
     *         hexadécimaux, faux sinon
     */
    public static boolean checkIfDecimal(String toCheck) {
        // TODO vérification par l'utilisation d'une REGEX
         return Pattern.matches("^-?\\d+$", toCheck);
    }
}
