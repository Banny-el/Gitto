package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Employee employee = new Employee("Raj", 1234);

        int employeeId = employee.getEmployeeId();
        System.out.println(employeeId);
        for (int i = 1; i <= 5; i++) {

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }




}


class Employee{

    private String name;
    private int EmployeeID;

    public Employee(String name, int EmpID){
        this.name = name;
        this.EmployeeID = EmpID;
    }

    public String getName(){
        return this.name;
    }
    public int getEmployeeId(){
        return this.EmployeeID;
    }
}