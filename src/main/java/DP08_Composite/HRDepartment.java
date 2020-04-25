package DP08_Composite;

public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
    }

    @Override
    public void lineofDuty() {
        System.out.println(name + " 负责员工招聘管理培训");
    }
}

