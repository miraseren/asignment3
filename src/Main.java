import classes.MyHashTable;
import classes.MyTestingClass;
import classes.Student;

public class Main {
    public static void main(String[] args) {
        checkHashTable();
    }
    public static void checkHashTable() {
        int size = 10000;
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(size);
        for (int i = 0; i < size; i++) {
            MyTestingClass test = new MyTestingClass(String.valueOf(i),String.valueOf(i));
            Student student = new Student(String.valueOf(i),String.valueOf(i));
            table.put(test,student);
        }
        int qw = 0;
        for (int i = 0; i < size; i++) {
            MyTestingClass test = new MyTestingClass(String.valueOf(i), String.valueOf(i));
            if (table.get(test) == null) {
                qw++;
                System.out.println("Value not: " + test);
            }
        }
        System.out.println(qw);
    }
}