package hbcu.stay.ready.algor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class Testing {
    private Solution solution;
    private String magazineText;
    @Before
    public void setup(){
        solution = new Solution();
        magazineText =  "this is my advice for you";
    }
    @Test
    public void hMapTest(){

        HashMap<String,Integer> hMap = new HashMap<>();
        hMap.put("sup",1);
        System.out.println(hMap);
        hMap.remove("sup",1);
        System.out.println(hMap);

        Assert.assertTrue(hMap.isEmpty());
    }

    @Test
    public void harmlessRansomNoteTestFail2(){
        String noteText = "this is secret note for you from secret admirer";
        Boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        Assert.assertFalse(actual);
    }
}
