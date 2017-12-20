package Task71;

import Task43.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student71 {
    public String name;
    public String surname;
    public Date UpdateDate;

    public Student71(){
    }

    public Student71(Student71 another){
        this.name = another.name;
        this.surname = another.surname;
        this.UpdateDate = another.UpdateDate;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setName(String sName){
        this.name = sName;
    }

    public void setSurname(String sSurname){
        this.surname = sSurname;
    }

    public void setUpdateDate(Date valDate){
        this.UpdateDate = valDate;
    }

    public String getUpdateDate(){
        DateFormat df = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        return df.format(UpdateDate);
    }

    public static void main (String [] args)
    {
        Student71 StudentFirst = new Student71();
        StudentFirst.setName("Nazar");
        StudentFirst.setSurname("Nazarenko");
        StudentFirst.setUpdateDate(new Date());

        Student71 StudentSecond  = new Student71(StudentFirst);
        StudentSecond.setName("Petro");

        System.out.println("    Names after rename: ");

        System.out.print("Student 1 " + StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());

        System.out.println(StudentFirst.getUpdateDate());

        System.out.print("Student 2 " + StudentSecond.getName() + " ");
        System.out.println(StudentSecond.getSurname());
        System.out.println(StudentSecond.getUpdateDate());

    }


}

