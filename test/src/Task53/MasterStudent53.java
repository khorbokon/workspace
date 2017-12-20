package Task53;

public class MasterStudent53 extends Student53 implements IWorkable{

    public Integer courceNumber;
    public boolean graduated;

    public Integer getCourceNumber() {
        return courceNumber;
    }

    public void setCourceNumber(Integer sCourceNumber) {
        this.courceNumber = sCourceNumber;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean sGrad){
        this.graduated = sGrad;
    }

    public void work(){
        System.out.println("I am working");
    }

    public void getPaid(){
        System.out.println("Salary !!!");
    }

    public static void main (String [] args){
        MasterStudent53 mStudent = new MasterStudent53();
        mStudent.graduated = true;
        mStudent.setName("Petro Ivanovych ");
        mStudent.setSurname("Kovalenko");
        mStudent.setCourceNumber(5);

        System.out.print(mStudent.getName());
        System.out.println(mStudent.getSurname());
        System.out.println(mStudent.getCourceNumber());
        System.out.println("Is Graduated? - " + mStudent.isGraduated());

        mStudent.work();
        mStudent.getPaid();
        mStudent.drinkBeer();
        mStudent.playGames();
    }



}
