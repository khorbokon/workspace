package Task73;

import Task72.Gender;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Student73 {
    public String name;
    public String surname;
    public Date UpdateDate;
    public Gender gender;

    public Student73(){
    }

    public Student73(Student73 another){
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

        String Names[] = {"Ivan", "Nazar", "Petro", "Vasyl", "Andriy", "Yurii", "Maxim", "Roman"};



        Student73 StudentFirst = new Student73();
        int a;
        Random random = new Random();
        a = random.nextInt(8);
        StudentFirst.setName(Names[a]);
        StudentFirst.setSurname("Nazarenko");
        StudentFirst.setUpdateDate(new Date());
        StudentFirst.setGender(Gender.Man);

        Student73 StudentSecond  = new Student73(StudentFirst);
        a = random.nextInt(8);
        StudentFirst.setName(Names[a]);

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

