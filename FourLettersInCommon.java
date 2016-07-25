package Hackfest;

import java.util.*;

public class FourLettersInCommon {
        
    public List<String> fourLettersInCommon(String word, String[] dictionary){
        //stores an ArrayList of sample words consisting of 4+ letters from word.
        List<String> sampleWords= new ArrayList<String>();
        //stores an ArrayList of dictionary words that contain 4+ letters from sample word.
        List<String> lettersInCommon = new ArrayList<String>();
        
        //Fills sampleWords ArrayList with possible combinations.
        for(int startIndex = 0; startIndex<=word.length();startIndex++){
            for(int endIndex = startIndex+4; endIndex<=word.length();endIndex++){
                sampleWords.add(word.substring(startIndex,endIndex));
            }
        }
        //Cycles through dictionary strings to check word by word if they contain the letters from sampleWords array
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
