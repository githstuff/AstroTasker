package com.box.colbert.model;

import com.yourkit.util.Strings;

import java.util.ArrayList;

/**
 * Created by Aidan on 12/5/2017.
 */
public class RecurringTask extends Task {
    private int streak;
    private CalendarWeek days;
    public RecurringTask(String description,int complexity){
        super(description, complexity);
        CalendarWeek days= new CalendarWeek();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private class CalendarWeek{
        private boolean sunday,monday,tuesday,wednesday,thursday,friday,saturday;
        private CalendarWeek(){
            sunday=monday=tuesday=wednesday=thursday=friday=saturday=true;
        }
    }
}
