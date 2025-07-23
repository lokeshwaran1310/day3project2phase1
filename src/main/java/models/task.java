package models;

import interfaces.Reportable;

public class task extends issue implements Reportable{
   private String assignedto;
   private String duedate;
    public task(int id, String title, String raisedperson, String desc,String assignedto,String duedate) {
        super(id, title, raisedperson, desc);
        this.assignedto=assignedto;
        this.duedate=duedate;
    }
    public String getAssignedto() {
        return assignedto;
    }
    public String getDuedate() {
        return duedate;
    }
    @Override
    public void display(){
        super.display();
    }
    @Override
    public void reportstatus(){
          System.out.println("Issue ID: "+getId()+" Assigned To: "+getAssignedto()+" Status: "+getStatus());
    }
   

}
