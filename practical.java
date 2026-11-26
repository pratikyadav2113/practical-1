class employee{

    int id;
    double salary;
    String name;

    employee(){
    }

    employee(int id, String name, double salary ){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Name: " + name);
    }

}

class manager extends employee{

    String department;
    double bonus;

    manager(int id, String name, double salary, String department, double bonus){
        super(id, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    void display(){
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);

        double total = salary + bonus;

        System.out.println("Total Salary : " + total);
    }
}

class practical{

    public static void main(String[] args){

        manager m1 = new manager(1, "Pratik yadav", 65000.75, "IT & Software", 6500.25);

        m1.display();


        
    }
}

