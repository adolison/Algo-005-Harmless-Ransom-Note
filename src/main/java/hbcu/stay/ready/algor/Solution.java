package hbcu.stay.ready.algor;

import java.util.HashMap;

public class Solution {
    public Boolean harmlessRansomNote(String message , String magazineText){

       String[] parts = message.split("\\.\\s|\\s|!");
       String[] magazineParts = magazineText.split("\\s|\\.");
        Boolean result=null;

        //create Hashmap of magazineText
        HashMap<String, Integer> hMap = new HashMap<>();
        for(int x =0;x<magazineParts.length;x++){
            if (hMap.containsKey(magazineParts[x])){
                int val = hMap.get(magazineParts[x]);
                hMap.replace(magazineParts[x],val,val+1);
            }else{
                hMap.put(magazineParts[x],1);
            }
        }
        //for each word in the message find it in the hMap
        for (String word : parts){
            if(!hMap.containsKey(word)) {
                result = false;
                break;
            }

            int value = hMap.get(word);
            if (hMap.containsKey(word)&& value!=0){
                hMap.put(word,value-1);
                result = true;
            }else{
                result = false;
                break;
            }

        }
        return result;
    }
}
