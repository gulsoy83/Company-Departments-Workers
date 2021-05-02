
package mylab2;

public class Company {
    
    private String companyName;
    private final int depQuantity = 4;
    private Department[] deps = new Department[depQuantity];

    public Company(String companyName) {
        this.companyName = companyName;
        for(int i=0; i<depQuantity;i++)
            deps[i]= new Department();
    }
    
    public void addWorker(Worker w1){
        for(int i=0; i<depQuantity ; i++){
            for(int j=0; j<deps[i].getWQuantity();j++){
                if(deps[i].getDepworkers()[j] == null){
                    deps[i].getDepworkers()[j] = w1;
                    return;
                }
            }
        }
    }
    
    public int maxYear(){
        int max=0,a=0;
        for(int i = 0; i< depQuantity ; i++){
            for(int j=0; j<deps[i].getWQuantity();j++){
                if(deps[i].getDepworkers()[j] != null){
                    a = deps[i].getDepworkers()[j].getYearsWorked();
                    
                    if(a>=max)
                        max=a;
                }
                    
                
            }
        }
        return max;
    }
    
    public void maxYearedWorkers(){
        int max = maxYear();
        for(int i = 0; i< depQuantity ; i++){
            for(int j=0; j<deps[i].getWQuantity();j++){
                if(deps[i].getDepworkers()[j] != null && deps[i].getDepworkers()[j].getYearsWorked() == max){
                    System.out.println(deps[i].getDepworkers()[j].getWname());  
                }
            }
                
        }
    }
    
    public void depAvgSalary(int dno){
        System.out.println("Average salary of department "+dno+" : "+deps[dno].avgSalary());
    }
    
    public void introduceCompany(){
        System.out.println("Company Name: "+ getCompanyName());
        for(int i=0; i< depQuantity ; i++)
            deps[i].depInfo(i);
    }

    public String getCompanyName() {
        return companyName;
    }
    
    public Department[] getDeps() {
        return deps;
    }
    
    
    
}
