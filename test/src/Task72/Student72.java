package Task72;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student72 {
    public String name;
    public String surname;
    public Date UpdateDate;
    public Gender gender;

    public Student72(){
    }

    public Student72(Student72 another){
        this.name = another.name;
        this.surname = another.surname;
        this.UpdateDate = another.UpdateDate;
        this.gender = another.gender;
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

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender() {
        return this.gender;
    }

    public static void main (String [] args)
    {
        Student72 StudentFirst = new Student72();
        StudentFirst.setName("Nazar");
        StudentFirst.setSurname("Nazarenko");
        StudentFirst.setUpdateDate(new Date());
        StudentFirst.setGender(Gender.Man);

        Student72 StudentSecond  = new Student72(StudentFirst);
        StudentSecond.setName("Petro");

        System.out.println("    Names after rename: ");

        System.out.print("Student 1 " + StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());
        System.out.println(StudentFirst.getUpdateDate());
        System.out.println(StudentFirst.getGender());

        System.out.print("Student 2 " + StudentSecond.getName() + " ");
        System.out.println(StudentSecond.getSurname());
        System.out.println(StudentSecond.getUpdateDate());
        System.out.println(StudentSecond.getGender());

    }


}

