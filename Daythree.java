import java.util.*;
public class Daythree {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = sc.nextLine();
        String fname,midname,lname;
        int index1=fullName.indexOf(" ");
        int index2=fullName.lastIndexOf(" ");
        if (index1 == index2) {
            fname = fullName.substring(0, index1);
            lname = fullName.substring(index1 + 1, fullName.length());
            System.out.println("First Name: " + fname);
            System.out.println("Last Name: " + lname);
        }
        else {
        fname=fullName.substring(0,index1);
        midname=fullName.substring(index1+1,index2);
        lname=fullName.substring(index2+1,fullName.length());
        System.out.println("First Name: "+fname);
        System.out.println("Middle Name: "+midname);
        System.out.println("Last Name: "+lname);
        }
    }
}
