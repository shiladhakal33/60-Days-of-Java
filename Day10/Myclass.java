package Day10;

interface Staff {
    void setName(String name);
    void showName();
    void setAddress(String address);
    void showAddress();
    void setPost(String post);
    void showPost();
}

interface NonTeaching extends Staff {
  
}

interface Teaching extends Staff {
    void setDept(String dept);
    void showDept();
}


class Admin implements NonTeaching, Teaching {
    private String name, address, post, dept;
    private float wh; // working hours

    public void setName(String name) {
        this.name = name; 
    }

    public void showName() {
        System.out.println("Name: " + name);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showAddress() {
        System.out.println("Address: " + address);
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void showPost() {
        System.out.println("Post: " + post);
    }

    public void setDept(String dept) {
        this.dept = dept; 
    }

    public void showDept() {
        System.out.println("Department: " + dept);
    }

  
    public void setWorkingHrs(float wh) {
        this.wh = wh;
    }

    public void showWorkingHrs() {
        System.out.println("Working Hrs: " + wh);
    }
}

public class Myclass {
    public static void main(String[] args) {
        
        System.out.println("--- Testing ADMIN ---");
        Admin a = new Admin();
        a.setName("Ram");
        a.setAddress("Pokhara");
        a.setPost("Admin Head")
        a.setDept("Administration");
        a.setWorkingHrs(8.5f);
        
        a.showName();
        a.showAddress();
        a.showPost();
        a.showDept();
        a.showWorkingHrs();

        System.out.println("\n--- Testing NON_TEACHING ---");
      
        NonTeaching nt = new Admin(); 
        nt.setName("Sita");
        nt.setAddress("Ktm");
        nt.setPost("Accountant");
        
        nt.showName();
        nt.showAddress();
        nt.showPost();

        System.out.println("\n--- Testing TEACHING ---");
    
        Teaching t = new Admin();
        t.setName("Juli"); 
        t.setAddress("Pokhara");
        t.setPost("Computer Engineering");
        t.setDept("IT");
        
        t.showName();
        t.showAddress();
        t.showPost();
        t.showDept();
        
   }
}