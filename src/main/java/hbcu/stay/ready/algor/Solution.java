package hbcu.stay.ready.algor;

import java.util.TreeMap;

public class Solution {
    //go through message and make sure secret does not repeat
    // or go through message and find words in message that appear in magazine text; then count multiples on both ends
    public Boolean harmlessRansomNote(String message , String magazineText){
        //go through message and make sure secret does not repeat
        TreeMap<String,Integer> tMap=new TreeMap<>();
        String[] parts = message.split("\\.\\s|\\s|!");
       // String[] magazineParts = magazineText.split("\\s|\\.");
        int time =0;
        Boolean answer = null;
        //int count = 0;
        //Boolean result=null;


        for (int i=0;i<parts.length;i++){
            if (parts[i].equals("secret")){
               if (time==0) {
                   time = 1;
                   answer = true;
               }else {
                   time +=1;
                answer = false;
               }
            }
        }

       /* for(int a =0;a<magazineParts.length;a++){
            for (int b=0;b<parts.length;b++){
                if (magazineParts[a].equals(parts[b])&& !magazineParts.equals("a")){//or the, is, or any article
                    if (count ==0){
                        count =1;
                        result = true;
                    }else{
                        count +=1;
                        result = false;
                    }
                }
            }

        }*/






            return answer;
    }
}
