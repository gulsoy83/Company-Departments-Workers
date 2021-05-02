
package mylab2;

public class Analyst extends Worker {

    public Analyst(String aname, int yearsworked, double salary) {
        super(aname,yearsworked,salary);
    }

    
    @Override
    public void increaseSalary() {
        this.setSalary( salary + salary *0.05);
        this.setYearsWorked(this.getYearsWorked()+1);
        
    }

    @Override
    public String toString() {
        return super.introduceSelf();
    }

    
    
}
