package Task53;
import Task51.cStudent;

public class PhdStudent53 extends cStudent implements IWorkable{

    public String thesis;

    public String getThesis(){
        return this.thesis;
    }

    public void setThesis (String valThesis){
        this.thesis = valThesis;
    }

    public static void main (String [] args){
        PhdStudent53 aPhdStudent = new PhdStudent53();
        aPhdStudent.setName("Vasyl Petrovych");
        aPhdStudent.setSurname("Tkachenko");
        aPhdStudent.setThesis("All birds can fly");

        System.out.println("Phd Student with name: ");
        System.out.print(aPhdStudent.getName());
        System.out.println(aPhdStudent.getSurname());
        System.out.println("is going to defend the Thesis: " + aPhdStudent.getThesis());

        aPhdStudent.work();
        aPhdStudent.getPaid();
    }

    @Override
    public void work() {
        System.out.println("Work is most important thing");
    }

    @Override
    public void getPaid() {
        System.out.println("just some money");
    }
}