package com.box.colbert.model;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Created by Aidan on 12/6/2017.
 */
public class CalendarWeek {

    //a map
    private LinkedHashMap<String,Boolean>  weekMap;

    public CalendarWeek() {
        weekMap = new LinkedHashMap<String,Boolean>();
        loadWeek(true,true,true,true, true,true,true);
    }
    public void loadWeek(boolean sunday, boolean monday,
                         boolean tuesday, boolean wednesday,
                         boolean thursday, boolean friday,
                         boolean saturday){
        weekMap.put("Sunday",sunday);
        weekMap.put("Monday",monday);
        weekMap.put("Tuesday",tuesday);
        weekMap.put("Wednesday",wednesday);
        weekMap.put("Thursday",thursday);
        weekMap.put("Friday",friday);
        weekMap.put("Saturday",saturday);
    }
    public boolean isDayTrue(String key){
        try{
            return weekMap.get(key);
        }catch(NullPointerException e){
            System.out.println("ERROR - invalid key: valid keys are \"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\"\"Saturday\"");
            System.exit(-1);
        }
        return true;
    }
    public void toggleDay(String key){
        try{
            weekMap.put(key,!weekMap.get(key));
        }catch(NullPointerException e){
            System.out.println("ERROR - invalid key: valid keys are \"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\"");
            System.exit(-1);
        }
    }
    public String toString(){
        return weekMap.toString();
    }
}