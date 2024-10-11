package fr.afpa.converter.tool;
                                                                                      
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/***
 * Classe regroupant les tests à compléter.
 * 
 * Il vous est demandé de la compléter en suivant un approche TDD - Test Driven Development
 * 
 * Marche à suivre pour suivre le cycle "Rouge-Vert-Refactor" :
 * 1. Focalisez vous sur 1 fonction (par exemple "testHexadecimalToDecimal")
 * 2. Construisez un jeu de test complet (par exemple une liste de nombres à héxadécimaux à convertir)
 * 3. Ajoutez UNE SEULE assertion qui vérifie un TEST INDIVIDUEL
 * 4. Développez la fonction associée pour qu'elle retourne le bon résultat (that's tour "baby step")
 * 5. Ajoutez UNE AUTRE assertion
 * 6. Vérifiez si le test passe, développez la fonction pour qu'elle retourne le bon résultat
 * 7. Ainsi de suite jusqu'à ce que votre jeu de test soit couvert.
 * 
 * Pour certaines de ces fonctions le jeu de test vous est donné.
 * Pour d'autre, il vous faudra le créer.
 */
class ConverterToolTest {

    @DisplayName("Conversion des nombres binaires en décimaux")
    @Test
    void testBinaryToDecimal() {

        String bin1 = "10";

        // 1. Test de la première donnée de test
        assertEquals(2, ConverterTool.binaryToDecimal(bin1));

        // 2. Test d'un autre donnée de test
        // ...
        assertEquals(2, ConverterTool.binaryToDecimal("10"));
        // Bien faire attention de bien penser aux erreurs dans la conception du jeu de test

        assertEquals(5, ConverterTool.binaryToDecimal("101")); 
        assertEquals(0, ConverterTool.binaryToDecimal("0"));  
        assertEquals(15, ConverterTool.binaryToDecimal("1111")); 
        assertEquals(-1, ConverterTool.binaryToDecimal("102")); 
    }
 
    
    @DisplayName("Conversion des nombres décimaux en binaire")
    @Test
    void testDecimalToBinary() {
        // TODO : compléter le test

        assertEquals("10", ConverterTool.decimalToBinary(2));  // 2 -> binary "10"
        assertEquals("101", ConverterTool.decimalToBinary(5));  // 5 -> binary "101"
        assertEquals("0", ConverterTool.decimalToBinary(0));    // 0 -> binary "0"
        assertEquals("1111", ConverterTool.decimalToBinary(15)); // 15 -> binary "1111"

    }

    @DisplayName("Vérification de la nature hexadécimale d'une chaîne de caractère")
    @Test
    void testIfHexadecimal() {
        // Valid hexadecimal strings
        assertEquals(true, ConverterTool.checkIfHexadecimal("1A"));
        assertEquals(true, ConverterTool.checkIfHexadecimal("FF"));
        assertEquals(true, ConverterTool.checkIfHexadecimal("0"));
    
        // Invalid hexadecimal strings
        assertEquals(false, ConverterTool.checkIfHexadecimal("GHI"));
        assertEquals(false, ConverterTool.checkIfHexadecimal("123G"));
    }
    

    // TODO : ajouter les fonctions de test pour chacune de celles qui sont utilisées dans l'application
    @DisplayName("Vérification si une chaîne de caractères représente un nombre entier (décimal)")
@Test
void testCheckIfDecimal() {
    // Valid decimal numbers
    assertEquals(true, ConverterTool.checkIfDecimal("123"));     // Positive integer
    assertEquals(true, ConverterTool.checkIfDecimal("-456"));    // Negative integer
    assertEquals(true, ConverterTool.checkIfDecimal("0"));       // Zero

    // Invalid decimal numbers
    assertEquals(false, ConverterTool.checkIfDecimal("12.34"));  // Decimal with a dot
    assertEquals(false, ConverterTool.checkIfDecimal("abc"));    // Non-numeric characters
    assertEquals(false, ConverterTool.checkIfDecimal("12a3"));   // Mix of numbers and letters
    assertEquals(false, ConverterTool.checkIfDecimal(""));       // Empty string
    assertEquals(false, ConverterTool.checkIfDecimal(" "));      // Just a space
}

}
