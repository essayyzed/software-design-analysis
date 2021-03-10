import javax.swing.plaf.synth.SynthEditorPaneUI;

abstract class Employee {
    private String name;
    protected static int age;
    private char gender;

    abstract int computeSalary(int base_salary, int days); 
}

class BoardMember extends Employee {
    
    public int computeSalary(int base_salary, int days) {
        int salary = 0;

        return salary = base_salary + (days*35) + (Employee.age*100);
    }
}

class Worker extends Employee {
    
    public int computeSalary(int base_salary, int days) {
        int salary = 0;

        return salary = base_salary + (days*45) + (Employee.age*50);
    }
}

class AddressBook {
    protected Employee employee;
    protected BoardMember boardMember;
    protected Worker worker;

    public void displaySalaryReport(int base_salary, int days){
        System.out.println(employee.computeSalary(base_salary, days));
        System.out.println(boardMember.computeSalary(base_salary, days));
        System.out.println(worker.computeSalary(base_salary, days));        
    }
 
    
}

 class main {
    public static void main(String[] args) {
        Worker sam = new Worker();
        sam.computeSalary(4500, 10);
        AddressBook x = new AddressBook();
        x.displaySalaryReport(1000, 20);
    }
}