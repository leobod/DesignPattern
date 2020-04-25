package DP08_Composite;

// 财务部和人力资源部门（leaf）

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
// TODO Auto-generated constructor stub
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
        System.out.println(name + " 负责公司财务收支管理");
    }
}

