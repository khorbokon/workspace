package Task43;

public class Computer {
    public String brand;
    public String hardDiskType;
    public int ram;
    public int screenSize;
    public String processor ;

    public Computer(String valBrand, String valProcessor, int valScreenSize){
        this.brand = valBrand;
        this.processor = valProcessor;
        this.screenSize = valScreenSize;
    }

    public Computer(String valProcessor, String valHardDiskType, int valRam, int valScreenSize){
        this.processor = valProcessor;
        this.hardDiskType = valHardDiskType;
        this.ram = valRam;
        this.screenSize = valScreenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String valBrand) {
        this.brand = valBrand;
    }

    public String getHardDiskType() {
        return hardDiskType;
    }

    public void setHardDiskType(String valHardDiskType) {
        this.hardDiskType = valHardDiskType;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int valRam) {
        this.ram = valRam;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int valScreenSize) {
        this.screenSize = valScreenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String valProcessor) {
        this.processor = valProcessor;
    }

}
