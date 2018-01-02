package Task54;

public class Student54 {
    public String name;
    public String surname;

    public Student54(){
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

    public static void main (String [] args)
    {
        Student54 StudentFirst = new Student54();
        StudentFirst.setName("Ivan");
        StudentFirst.setSurname("Nazarenko");

        Student54 StudentSecond  = StudentFirst;
        StudentSecond.setName("Petro");

        System.out.println("    names after rename: ");

        System.out.print("Student 1 " + StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());


        System.out.print("Student 2 " + StudentSecond.getName() + " ");
        System.out.println(StudentSecond.getSurname());

    }


}
