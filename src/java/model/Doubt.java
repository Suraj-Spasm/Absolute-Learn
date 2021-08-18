package model;

public class Doubt {
    private int Doubt_no;
    private String Name,Email,Subject,Doubt;
    
    public Doubt() {
    }

    public Doubt(int Doubt_no, String Name, String Email, String Subject, String Doubt) {
        this.Doubt_no = Doubt_no;
        this.Name = Name;
        this.Email = Email;
        this.Subject = Subject;
        this.Doubt = Doubt;
    }

    public int getDoubt_no() {
        return Doubt_no;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getSubject() {
        return Subject;
    }

    public String getDoubt() {
        return Doubt;
    }

    public void setDoubt_no(int Doubt_no) {
        this.Doubt_no = Doubt_no;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setDoubt(String Doubt) {
        this.Doubt = Doubt;
    }

    @Override
    public String toString() {
        return "Doubt{" + "Doubt_no=" + Doubt_no + ", Name=" + Name + ", Email=" + Email + ", Subject=" + Subject + ", Doubt=" + Doubt + '}';
    }
    
}
