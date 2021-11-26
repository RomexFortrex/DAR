package tp3.ex3;

public class Main {
    
    public static void main(String[] args) {
        ISISandwich isiSandwich = new ISISandwich();
        Student student = new Student("Salah",isiSandwich);
        Vendor vendor = new Vendor("El Baya3",isiSandwich);
        student.start();
        vendor.start();
    }
}
