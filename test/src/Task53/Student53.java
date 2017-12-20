package Task53;

public class Student53 implements IChillable{
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

    public void drinkBeer (){
        System.out.println("Friday everyday!");
    }

    public void playGames(){
        System.out.println("In case no money for beer - play!");
    }

    public static void main (String [] args)
    {
        Student53 StudentFirst = new Student53();
        StudentFirst.setName("Nazar");
        StudentFirst.setSurname("Nazarenko");

        System.out.print(StudentFirst.getName() + " ");
        System.out.println(StudentFirst.getSurname());

        StudentFirst.drinkBeer();
        StudentFirst.playGames();

    }


}
