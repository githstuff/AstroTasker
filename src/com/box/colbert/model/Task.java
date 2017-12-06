package com.box.colbert.model;

/**
 * Created by Aidan on 12/5/2017.
 */
public class Task {
    private String description;
    private int complexity;
    //constructors
    public Task(String description,int complexity){
        this.description =description;
        this.complexity=complexity;
    }
    //getters
    public String getdescription(){
        return description;
    }
    public int getcomplexity(){
        return complexity;
    }
    //setters
    public void setcomplexity(int complexity){
        this.complexity=complexity;
    } public void setdescription(String description){
        this.description=description;
    }
    public String toString(){
        return String.format("Task[description: %s], [complexity: %d]", description, complexity);
    }
}
