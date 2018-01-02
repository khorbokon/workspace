package Task57;

public class Student57 {
    public String name;
    public String surname;

    public Student57(){
    }

    public Student57(Student57 another){
        this.name = another.name;
        this.surname = another.surname;
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

    protected String toString(Student57 another){
             return this.name;

    }

    public static void main (String [] args)
    {
        Student57 StudentFirst = new Student57();
        StudentFirst.setName("Nazar");
        StudentFirst.setSurname("Nazarenko");

        Student57 StudentSecond  = new Student57(StudentFirst);
        StudentSecond.setName("Petro");

        System.out.println("    names after rename: ");

        System.out.print("Student 1 " + StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());


        System.out.print("Student 2 " + StudentSecond.getName() + " ");
        System.out.println(StudentSecond.getSurname());

        System.out.println("First Student name - " + StudentFirst.toString(StudentFirst));
        System.out.println("Second Student name - " + StudentFirst.toString(StudentSecond));
    }

}

