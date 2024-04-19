package $2_Classes.Constructor;

public class Main {
    private int baseSalary;
    private int hourlyRate;


    // Hourly Rate
    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) throws Exception {
        if(hourlyRate <= 0){
            throw new Exception("Hourly Rate cannot be this");
        }
        this.hourlyRate = hourlyRate;
    }


    // Base Salary
    public void setBaseSalary(int baseSalary) throws Exception {
        if(baseSalary <= 0){
            throw new Exception("Salary cannot be 0 or less");
        }
        else{
            this.baseSalary = baseSalary;
        }
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int calculateWage(int extraHours){
        return  baseSalary + (hourlyRate*extraHours);
    }
}
