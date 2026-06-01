import java.util.*;
public class Process{
    private int processID;
    private String state;
    private int priority;
Process(int processID){
  this.processID=processID;
  this.state= "NEW";
  this.priority=5;
}
Process(int processID,int priority ){
  this.processID=processID;
  this.state= "NEW";
  this.priority=priority;
}
Process(int processID,String state, int priority ){
  this.processID=processID;
  this.state=state;
if(priority>=1&&priority<=10){
  this.priority=priority;
}
else{
 this.priority=5;
}
}



public void displayProcess() {
        System.out.println("Process ID: " + processID + " | State: " + state + " | Priority: " + priority);
    }
public static void main(String[] args) {
        
        Process p1 = new Process(1001);
        p1.displayProcess(); 
        Process p2 = new Process(1002, 9);
        p2.displayProcess(); 

        Process p3 = new Process(1003, "READY",99);
        p3.displayProcess(); 
    }
}