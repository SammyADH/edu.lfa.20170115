package Student_Menu_Items;

import java.util.List;

public class SArraylist {

    private int id;
    private String Fname, Lname, email;
    private List clist;

    public List getClist() {
        return clist;
    }

    public void setClist(List clist) {
        this.clist = clist;
    }
    

    public SArraylist() {
    }

    public SArraylist(int id, String Fname, String Lname, String email, List clist) {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.email = email;
        this.clist = clist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SArraylist{" + "id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email + '}';
    }

}
