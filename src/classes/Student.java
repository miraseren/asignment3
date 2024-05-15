package classes;
public class Student {
    private String barcode;
    private String name;
    public Student(String name,String barcode) {
        this.name=name;
        this.barcode=barcode;
        private double gpa;
    public Student(String name,String barcode, double gpa) {
            setGpa(gpa);
            setBarcode(barcode);
            setName(name);
        }
        public String getName() {
            return name;
        }
        public String getBarcode() {
            return barcode;
        }
        public double getGpa() {
            return gpa;
        }
        public void setBarcode(String barcode) {
            this.barcode = barcode;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }