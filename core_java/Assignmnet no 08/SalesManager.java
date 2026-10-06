package p2;

import p1.Employee;

public class SalesManager extends Employee {

    private double incentive;
    private int target;

    public SalesManager(int id, String name, double salary,
                         double incentive, int target) {

        super(id, name, salary);

        this.incentive = incentive;
        this.target = target;
    }

    public double getIncentive() {
        return incentive;
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    @Override
    public double calSal() {
        return salary + incentive;
    }

    @Override
    public String toString() {
        return "SalesManager [id=" + id + ", name=" + name + ", salary=" + salary + ", incentive=" + incentive +", target=" + target + "]";
    }
}