package Task43;

public class Student {

    public String strudentName;
    public String universityName;
    public int courseNumber;

    public Student (String valStudentName){
        this.strudentName = valStudentName;
    }

    public Student (String valStudentName, String valUniversityName, int valCourseName){
        this.strudentName = valStudentName;
        this.universityName = valUniversityName;
        this.courseNumber = valCourseName;

    }

    public String getStrudentName() {
        return strudentName;
    }

    public void setStrudentName(String valStrudentName) {
        this.strudentName = valStrudentName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String valUniversityName) {
        this.universityName = valUniversityName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int valCourseNumber) {
        this.courseNumber = valCourseNumber;
    }

}
