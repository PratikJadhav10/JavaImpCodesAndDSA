import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Transaction {
    private double amount;
    private String date;

    public Transaction(double amount, String date) {
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}



class Employee{
    private long id;
    private String name;
    private double salary;
    private String department;
    private String gender;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(long id, String name, double salary, String department, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//Given a list of integers,filter out the odd numbers,
// sort the remaining even numbers in descending order,
// and collect them into a new list.
public class StreamApi {


    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3, 56, 67, 12, 77, 19, 66, 97);
        List<String> strs = Arrays.asList("Pratik", "Ajay", "Omkar", "Vikas", "Chetan");

        List<Integer> result = nums.stream().filter(n -> n % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);

        // Given a list of strings, convert each string to uppercase,
        // sort them alphabetically, and collect them into a new list.
        List<String> result1 = strs.stream()
                .map(String::toUpperCase) // Convert each string to uppercase using method reference
                .sorted() // Sort them alphabetically
                .collect(Collectors.toList()); // Collect the result into a new list
        System.out.println(result);
        System.out.println("-----------------------------------");
        //---------------------------------------------------------
        //Given a list of Employee objects, find the employee with the
        // highest salary using the Streams API.
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Ramesh", 10000, "HR", "Male"),
                new Employee(2, "Sneha", 50000, "BA", "Female, "),
                new Employee(3, "Harshad", 45000, "Developer", "Male"));


        Optional<Employee> highestSalaryEmployee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        if (highestSalaryEmployee.isPresent()) {
            System.out.println("Employee with highest salary: " + highestSalaryEmployee.get());
        } else {
            System.out.println("No employees found.");
        }
        System.out.println("-----------------------------------");
        //Given a list of Employee objects, find the employee with the
        // 2nd highest salary using the Streams API.
        Double secondHighestSal = employeeList.stream()
                        .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                        .findFirst().orElseThrow(() -> new RuntimeException());

        System.out.println("Second Highest Salary:"+ secondHighestSal);


        System.out.println("-----------------------------------");
        //Given a list of Person objects with fields name and age,
        // group the people by age and create a map where the key
        // is the age and the value is a list of names.
        List<Person> personList = Arrays.asList(
                new Person("Ronaldo", 39),
                new Person("Messi", 38),
                new Person("Yamal", 17),
                new Person("Di Maria", 38),
                new Person("Mbappe", 26),
                new Person("Pedri", 17)
        );

        Map<Integer, List<String>> abc = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())));

        abc.forEach((age, names) -> {
            System.out.println("age:" + age);
            System.out.println("name:" + names);
        });
        System.out.println("-----------------------------------");

        //Given a list of lists of integers,
        // flatten the list into a single list of integers
        // and find the sum of all integers.

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> flatList = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        int sum = flatList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("list of lists: " + listOfLists);
        System.out.println("Sum of all integers: " + sum);
        System.out.println("Flattened list: " + flatList);
        System.out.println("Sum of all integers: " + sum);
        System.out.println("-----------------------------------");

        //Given a list of integers, partition the list into two lists:
        // one containing all numbers greater than 10,
        // and the other containing all numbers 10 or less.

        List<Integer> numlist = Arrays.asList(2, 8, 6, 3, 12, 45, 19);

        Map<Boolean, List<Integer>> partitioned = numlist.stream()
                .collect(Collectors.partitioningBy(n -> n > 10));

        List<Integer> greaterThan10 = partitioned.get(true);
        List<Integer> tenOrLess = partitioned.get(false);

        System.out.println("Numbers greater than 10: " + greaterThan10);
        System.out.println("Numbers 10 or less: " + tenOrLess);
        System.out.println("-----------------------------------");

        //Given a list of Transaction objects with fields amount and date,
        // calculate the total, average, maximum, and minimum transaction amounts.
        List<Transaction> transactions = Arrays.asList(
                new Transaction(100.0, "2025-01-01"),
                new Transaction(200.0, "2025-01-02"),
                new Transaction(300.0, "2025-01-03"),
                new Transaction(150.0, "2025-01-04"),
                new Transaction(50.0, "2025-01-05")
        );
        DoubleSummaryStatistics stats = transactions.stream()
                .collect(Collectors.summarizingDouble(Transaction::getAmount));

        System.out.println("Total Amount: " + stats.getSum());
        System.out.println("Average Amount: " + stats.getAverage());
        System.out.println("Maximum Amount: " + stats.getMax());
        System.out.println("Minimum Amount: " + stats.getMin());
        System.out.println("-----------------------------------");

        //Reducing
        //Given a list of strings, concatenate them into a single string
        // with each word separated by a comma.

        {
            List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
            /*List<Integer> map = words.stream()
                    .map(m -> m.length())
                    .collect(Collectors.toList());
            System.out.println("Length of Strings: " + map);*/

            String concatnated = words.stream()
                    .collect(Collectors.joining(", "));

            System.out.println("Concatenated String: " + concatnated);
            
        }

        //WAP to remove 0 form list and replace with underscore

        List<Integer> list = Arrays.asList(0, 4, 30, 40, 44);
        List<Integer> input = Arrays.asList(1,7,0,4);
        input.stream().filter(n -> n>5).forEach(System.out::println);

        List<String> modifiedList =  list.stream()
                .map(n -> n.toString().replace("0", "_"))
                .collect(Collectors.toList());
        System.out.println(modifiedList);

        List<String> modifiedList1 =  list.stream()
                .map(n -> n==0? "_" : n.toString())
                .collect(Collectors.toList());
        System.out.println(modifiedList1);
        System.out.println("---------------------------");

        //Merge two sorted list
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,6,7,8);

        

        List<Integer> merged = mergedSortedList(list1, list2);
        System.out.println("Merged:"+merged);
    }

    public static List<Integer> mergedSortedList(List<Integer> list1, List<Integer> list2){
        return Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.toList());
    }


}
