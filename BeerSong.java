/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottlesofbeer;

/**
 *
 * @author Kevin
 */
public class Ninety_Nine_Bottles_of_Beer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 99;
        String finalStatement = "no more bottles of beer on the wall";
        for (i=99; i > 0; i--){
            System.out.println(i + " bottles of beer on the wall, " + i
            + " bottles of beer! Take one down, pass it around, ");
        }
        System.out.print(finalStatement);
        
        
    }
    
}
