package Task55;

public class Student55{
    public String name;
    public String surname;

    public Student55 (){
    }

    public Student55 (Student55 another){
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

    protected boolean equals(Student55 another){
        if (another instanceof Student55) {
            return (this.name.equals(another.name)) && (this.surname.equals(another.surname));}
        else return false;
    }

    public static void main (String [] args)
    {
        Student55 StudentFirst = new Student55();
        StudentFirst.setName("Nazar");
        StudentFirst.setSurname("Nazarenko");

        Student55 StudentSecond  = new Student55(StudentFirst);
        StudentSecond.setName("Petro");

        System.out.println("    names after rename: ");

        System.out.print("Student 1 " + StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());


        System.out.print("Student 2 " + StudentSecond.getName() + " ");
        System.out.println(StudentSecond.getSurname());

        System.out.println(StudentFirst.equals(StudentSecond));
    }


}

