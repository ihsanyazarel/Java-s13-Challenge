package employeeApp;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    private void checkGiro(double giro){
        if(giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }
    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("İlgili indexte developer mevcut.");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
