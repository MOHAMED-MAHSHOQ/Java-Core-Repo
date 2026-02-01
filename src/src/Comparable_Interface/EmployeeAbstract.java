package src.Comparable_Interface;

public abstract class EmployeeAbstract implements Comparable<EmployeeAbstract> {
    int employee_id;
    int employee_age;
    String employee_name;

    abstract public void ReqMyPosition();

    public int compareTo(EmployeeAbstract o) {
        if(this.employee_age == o.employee_age)     return 0;

        if(this.employee_age > o.employee_age)      return 1;
        else return -1;

    }

    @Override
    public String toString() {
        return employee_name+" : with age " + employee_age;
    }
}
