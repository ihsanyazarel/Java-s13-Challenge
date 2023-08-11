package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealthplan(int index, String name) {
        try {
            boolean isExist = false;
            for(String healtplan: healthplans){
                if(healtplan.equals(name)){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                if (healthplans[index] == null) {
                    healthplans[index] = name;
                } else {
                    System.out.println("İlgili index için atama yapılmış");
                }
            } else{
                System.out.println(name + " bu isimde healthplan mevcut");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama  yapıldı" + index);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
