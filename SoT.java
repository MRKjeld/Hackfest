/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackfest;

/**
 *
 * @author 91025951
 */
public class SoT {
    
    static String w = "wording";
    static String[] d = new String[]{"start","wording", "mording", "wordblam", "ordinary", "unusual"};
    
    public static void main(String[] args) {
        
        FourLettersInCommon flic = new FourLettersInCommon();
        System.out.println(flic.fourLettersInCommon(w, d));
    }
    
}
