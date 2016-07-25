
package Hackfest;

public class SoT {
    
    static String w = "wording";
    static String[] d = new String[]{"start","wording", "mording", "wordblam", "ordinary", "unusual"};
    
    public static void main(String[] args) {
        
        FourLettersInCommon flic = new FourLettersInCommon();
        System.out.println(flic.fourLettersInCommon(w, d));
    }
    
}
