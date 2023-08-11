package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

        HealthPlan plan1 = new HealthPlan(1, "X Sigorta", Plan.ADVANCE);
        HealthPlan plan2 = new HealthPlan(2, "Y Sigorta", Plan.NORMAL);

        System.out.println(plan1.getPlan().getName() + " - " +plan1.getPlan().getPrice());

        String[] healthplans = new String[3];
        //["X Sigorta", "Y Sigorta", null]
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();

        Employee developer = new Employee(1, "Ali Veli", "ali@veli.com", "1234", healthplans);
        developer.addHealthplan(3, "X Sigorta");
        System.out.println(developer);

        String[] developerNames = new String[5];
        developerNames[0] = developer.getFullName();
        //System.out.println(Double.MAX_VALUE);
        Employee junior = new Employee(2, "Ahmet Mehmet", "x", "1245", healthplans);
        //developerNames[1] = junior.getFullName();
        Company company = new Company(1, "Workintech", 1200000000000.45, developerNames);
        company.addEmployee(1, junior.getFullName());

        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args){
        workWithData();
    }
}
