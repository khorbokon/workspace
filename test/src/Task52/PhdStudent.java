package Task52;

import Task51.cStudent;

public class PhdStudent extends cStudent{

    public String thesis;

    public String getThesis(){
        return this.thesis;
    }

    public void setThesis (String valThesis){
        this.thesis = valThesis;
    }

    public static void main (String [] args){
        PhdStudent aPhdStudent = new PhdStudent();
        aPhdStudent.setName("Vasyl Petrovych");
        aPhdStudent.setSurname("Tkachenko");
        aPhdStudent.setThesis("All birds can fly");

        System.out.println("Phd Student with name: ");
        System.out.print(aPhdStudent.getName());
        System.out.println(aPhdStudent.getSurname());
        System.out.println("is going to defend the Thesis: " + aPhdStudent.getThesis());

    }
}
