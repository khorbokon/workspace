package Task51;

public class cStudent
{
    private String name;
    private String surname;

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

public static void startStudy(cStudent aStudent){
    System.out.println("Student " + aStudent.name + " with Surname - "+ aStudent.surname + ", takes Math classes");
}

public static void getScore(cStudent aStudent){
    System.out.println("Student " + aStudent.name + " with Surname - "+ aStudent.surname + ", get '3' mark on Math class");
}

    public static void main (String [] args)
    {
        cStudent StudentFirst = new cStudent();
        StudentFirst.setName("Nazar");
        StudentFirst.setSurname("Nazarenko");

        System.out.print(StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());

        String aName = StudentFirst.name;
        String aSurname = StudentFirst.surname;

        startStudy(StudentFirst);
        getScore(StudentFirst);
    }
}
