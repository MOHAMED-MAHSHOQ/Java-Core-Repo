package src.Comparable_Interface;

public class Employee1 extends EmployeeAbstract{
    int explevel;
    String position = "";

    Employee1(int employee_id,int employee_age,String employee_name,int explevel){
        super();
        this.employee_id=employee_id;
        this.employee_age=employee_age;
        this.employee_name=employee_name;
        if(explevel<2) position="Ground Staff";
        else position="Manager";
    }

    @Override
    public void ReqMyPosition() {
        System.out.println("I request for < My position > : Request Accepted !!\n Employee  "+employee_name+"'s Position assigned to  "+ this.position);
    }
}
