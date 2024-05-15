package classes;

public class Student {
    private String barcode;
    private String name;
    public Student(String name,String barcode) {
        this.name=name;
        this.barcode=barcode;
    }
    public String getName() {
        return name;
    }
    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public void setName(String name) {
        this.name = name;
    }
}