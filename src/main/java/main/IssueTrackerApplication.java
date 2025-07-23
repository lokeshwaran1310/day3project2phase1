package main;

import java.util.ArrayList;
import java.util.List;

import models.bug;
import models.issue;
import models.task;

public class IssueTrackerApplication {
    public static void main(String[]args){
        List<issue> l=new ArrayList<>();
        l.add(new bug(100,"ui issue","Lokesh","sometimes ui is not responding properly","medium"));
        l.get(0).closestat();
        l.add(new bug(101,"firewall issue","hari","it allows spam websites to intrude","high"));
        l.add(new bug(102,"vpn issue","adrin","Disconnects often","low"));
        l.add(new task(103,"Setup Logging","Lokesh","configure SLF4J and Logback for console and file outputs","Developer1","25-07-2025"));
        l.add(new task(104,"Enable Debug Mode","hari","iactivate debug flag to print SQL queries at runtime","Developer2","24-07-2025"));
        l.get(4).closestat();
        l.add(new task(105,"Send Test Email","adrin"," trigger the email service to send a welcome message to test@xyz.com","Developer3","26-07-2025"));
        System.out.println("DETAILS: ");
        for(issue ent:l){
            ent.display();
        }
        System.out.println("REPORT: ");
        for(issue ent:l){
           ent.reportstatus();
        }
        System.out.println("---------------------------------------------------------");

    }
}
