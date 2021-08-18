package model;
import java.sql.Date;
import java.sql.Time;
import java.util.logging.Logger;

public class Schedule {
    private int Lecture_no;
    private String Lecture,Description;
    private Date Lecture_date = new Date(0);
    private Time Start_time = new Time(0);
    private Time End_time = new Time(0);
    
    public Schedule() {
    }

    public Schedule(int Lecture_no,String Lecture, String Description,Date Lecture_date,Time Start_time,Time End_time) {
        this.Lecture_no=Lecture_no;
        this.Lecture = Lecture;
        this.Description = Description;
        this.Lecture_date= Lecture_date;
        this.Start_time = Start_time;
        this.End_time = End_time;
    }

    public void setLecture_no(int Lecture_no) {
        this.Lecture_no = Lecture_no;
    }

    public int getLecture_no() {
        return Lecture_no;
    }

    public void setLecture(String Lecture) {
        this.Lecture = Lecture;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setLecture_date(Date Lecture_date) {
        this.Lecture_date = Lecture_date;
    }

    public void setStart_time(Time Start_time) {
        this.Start_time = Start_time;
    }

    public void setEnd_time(Time End_time) {
        this.End_time = End_time;    
    }

    public String getLecture() {
        return Lecture;
    }

    public String getDescription() {
        return Description;
    }

    public Date getLecture_date() {
        return Lecture_date;
    }

    public Time getStart_time() {
        return Start_time;
    }

    public Time getEnd_time() {
        return End_time;
    }

    @Override
    public String toString() {
        return "Schedule{" + "Lecture_no=" + Lecture_no + ", Lecture=" + Lecture + ", Lecture_date=" + Lecture_date + ", Start_time=" + Start_time + ", End_time=" + End_time +", Description=" + Description +'}';
    }

 
}