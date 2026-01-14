import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNew {

    private int id;
    private String name;
    private double sal;

    public EmployeeNew(){

    }

    public EmployeeNew(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public EmployeeNew(int i, String pratik) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
       // if ()

        return super.equals(obj);
    }

    public  void calculate(int a, int b){

    }
    public  void calculate(int x, long y){

    }

    public static void main(String[] args) {
        List<EmployeeNew> emp = Arrays.asList(new EmployeeNew(1,"pratik",30000),
                new EmployeeNew(2,"Ajay",45000),
                new EmployeeNew(1,"Omkar",20000));

       /* List<Double> obj = emp.stream()
                .sorted(Comparator.comparingDouble(EmployeeNew::getSal))
                .

                .collect(Collectors.toList());*/


    }




}
