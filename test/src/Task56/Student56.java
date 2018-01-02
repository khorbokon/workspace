package Task56;

public class Student56 {
    public String name;
    public String surname;

    public Student56(){
    }

    public Student56(Student56 another){
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

    protected boolean equals(Student56 another){
        if (another instanceof Student56) {
            return (this.name.equals(another.name)) && (this.surname.equals(another.surname));}
        else return false;
    }

    public static void main (String [] args)
    {
        Student56 StudentFirst = new Student56();
        StudentFirst.setName("Nazar");
        StudentFirst.setSurname("Nazarenko");

        Student56 StudentSecond  = new Student56(StudentFirst);
        StudentSecond.setName("Petro");

        System.out.println("    names after rename: ");

        System.out.print("Student 1 " + StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());


        System.out.print("Student 2 " + StudentSecond.getName() + " ");
        System.out.println(StudentSecond.getSurname());

        System.out.println("Are students names equal? - " + StudentFirst.equals(StudentSecond));
    }


}

