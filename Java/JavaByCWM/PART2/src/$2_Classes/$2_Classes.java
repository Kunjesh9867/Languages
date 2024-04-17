package $2_Classes;

public class $2_Classes {
    public static void main(String[] args) throws Exception {

        {
            TextBox textBoxInstance = new TextBox();
            var textBoxInstance2 = new TextBox();

            textBoxInstance2.setText("Kunjesh");
            System.out.println(textBoxInstance2.text); // Kunjesh
            System.out.println(textBoxInstance.text); // null
            // The above code produce the result because
            // There is 2 different object.


            TextBox textBoxSimilar1 = new TextBox();
            TextBox textBoxSimilar2 = textBoxSimilar1;
            textBoxSimilar1.setText("Kunjesh Ramani");

            System.out.println(textBoxSimilar1.text); // Kunjesh Ramani
            System.out.println(textBoxSimilar2.text); // Kunjesh Ramani
            // These both the variable is referring to the same object
            // Hence, produce the same result.

        }



        Employee employee = new Employee();
        employee.setBaseSalary(2);
        employee.setHourlyRate(-1);
        int totalWage = employee.calculateWage(10);
        System.out.println(totalWage);



    }
}
