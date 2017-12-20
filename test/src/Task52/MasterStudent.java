package Task52;

import Task51.cStudent;

public class MasterStudent extends cStudent {
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

    public static void main (String [] args){
        MasterStudent mStudent = new MasterStudent();
        mStudent.graduated = true;
        mStudent.setName("Petro Ivanovych");
        mStudent.setSurname("Kovalenko");
        mStudent.setCourceNumber(5);

        System.out.print(mStudent.getName());
        System.out.println(mStudent.getSurname());
        System.out.println("Currently finished cource # " + mStudent.getCourceNumber());
        System.out.println("Is Graduated? - " + mStudent.isGraduated());
    }


}
