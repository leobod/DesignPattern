package DP08_Composite;

//  具体公司类，是树枝节点(Composite)

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

    private List<Company> childrenCompany = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
// TODO Auto-generated constructor stub
    }

    @Override
    public void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
    }

    @Override
    public void display(int depth) {
    }

    @Override
    public void lineofDuty() {
    }
}
