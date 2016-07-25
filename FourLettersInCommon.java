/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackfest;

import java.util.*;

public class FourLettersInCommon {
        
    public List<String> fourLettersInCommon(String word, String[] dictionary){
        List<String> sampleWords= new ArrayList<String>();
        List<String> lettersInCommon = new ArrayList<String>();
        
        //will contain a dictionary of sample words to run up against dictionary.
        
        for(int startIndex = 0; startIndex<=word.length();startIndex++){
            for(int endIndex = startIndex+4; endIndex<=word.length();endIndex++){
                sampleWords.add(word.substring(startIndex,endIndex));
            }
        }
        for(int dCycle = 0; dCycle<dictionary.length;dCycle++){
            for(int wCycle = 0; wCycle<sampleWords.size();wCycle++){
                if(dictionary[dCycle].contains(sampleWords.get(wCycle))){
                    lettersInCommon.add(dictionary[dCycle]);
                    break;
                }
            }
        }
        return lettersInCommon;
    }
    
}
