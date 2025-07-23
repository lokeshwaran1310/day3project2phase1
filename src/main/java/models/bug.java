package models;

import interfaces.Reportable;

public class bug extends issue implements Reportable {  
    private String severity;
    public bug(int id, String title, String raisedperson, String desc,String severity) {
        super(id, title, raisedperson, desc);
        this.severity=severity;
    }
    public String getSeverity() {
        return severity;
    }
    
    @Override
    public void display(){
         super.display();
    }
    @Override
    public void reportstatus(){
        System.out.println("Issue ID: "+getId()+" Severity Level: "+getSeverity()+" Status: "+getStatus());
    }

    
}
