package Task43;

public class Car {
    public String model;
    public int year;
    public String color;
    public String carClass;

    public Car(String valModel, int valYear, String valColor){
        this.model = valModel;
        this.year = valYear;
        this.color = valColor;
    }

    public Car (String valModel, String valCarClass){
        this.model = valModel;
        this.carClass = valCarClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String valModel){
        this.model = valModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String valColor){
        this.color = valColor;
    }

    public int getYear(){
        return year;
    }

    public void setYear(String valColor){
        this.color = valColor;
    }

    public String getCarClass(){
        return carClass;
    }

    public void setCarClass (String valCarClass){
        this.carClass = valCarClass;
    }

}
