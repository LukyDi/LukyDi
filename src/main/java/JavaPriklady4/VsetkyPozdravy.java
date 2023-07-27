/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPriklady4;
 
/**
 *
 * @author Luky
 */

import sk.tmconsulting.anglicky.PozdravAnglicky;
import sk.tmconsulting.madarsky.PozdravMadarsky;
import sk.tmconsulting.nemecky.PozdravNemecky;
import sk.tmconsulting.slovensky.PozdravSlovensky;


public class VsetkyPozdravy {
    
    public static void main(String args[] ){
    
    PozdravAnglicky.anglicky();
    PozdravNemecky.nemecky();
    PozdravMadarsky.madarsky();
    PozdravSlovensky.slovensky();
    
    }
}
