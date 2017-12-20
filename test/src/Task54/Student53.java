package Task54;

public class Student53{
    public String name;
    public String surname;

    public Student53 (){
    }

   /* public Student53 (Student53 another){
        this.name = another.name;
        this.surname = another.surname;
    }
*/
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
        Student53 StudentFirst = new Student53();
        StudentFirst.setName("Ivan");
        StudentFirst.setSurname("Nazarenko");

        Student53 StudentSecond  = StudentFirst;
        StudentSecond.setName("Petro");

        System.out.println("    names after rename: ");

        System.out.print("Student 1 " + StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());


        System.out.print("Student 2 " + StudentSecond.getName() + " ");
        System.out.println(StudentSecond.getSurname());

    }


}
