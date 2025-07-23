package models;

import interfaces.Reportable;

public class issue implements Reportable{
    private int id;
    private String title;
    private String desc;
    private String raisedperson;
    private String status;
    public issue(int id,String title,String raisedperson,String desc){
        this.id=id;
        this.title=title;
        this.desc=desc;
        this.raisedperson=raisedperson;
        this.status="Open";
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return desc;
    }
    public String getRaisedperson() {
        return raisedperson;
    }
    public String getStatus() {
        return status;
    }
    public void closestat(){
        this.status="Closed";
    }
    public void display(){
        System.out.println("Issue Id: "+getId());
        System.out.println("Issue Title: "+getTitle());
        System.out.println("Issue Description: "+getDesc());
        System.out.println("Issue Status: "+getStatus());
        System.out.println("Ticket Raised By: "+getRaisedperson());
        System.out.println("---------------------------------------------------------");
        
    }
    @Override
  public void reportstatus(){
  }
}
