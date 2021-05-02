
package mylab2;


public abstract class Worker {
    protected String wname;
    protected int yearsWorked;
    protected double salary;

    public Worker(String wname, int yearsWorked, double salary) {
        this.wname = wname;
        this.yearsWorked = yearsWorked;
        this.salary = salary;
    }
 
    public abstract void increaseSalary();
    
    public String getWname() {
        return wname;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    public double getSalary() {
        return salary;
    }


    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String introduceSelf(){
        String message = "My name: "+ this.getWname() + ", i've been working in this company for " + this.getYearsWorked() + " years. My current salary is: "+ this.getSalary();
        return message;
    }
    
    
}
