package DP08_Composite;

/**
 * 组合模式
 * 类比树结构
 *
 * Node(Composite定义有枝节点行为,用来存储子部件)
 * Leaf(叶子节点对象，叶子节点没有子节点。)
 *
 *
 */

public class RunCompositePattern {
    public static void main(String[] args) {
        // 一个总公司，包含HR部门和财务部门
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        //2个子公司,每个子公司都有HR部门和财务部门
        ConcreteCompany com1 = new ConcreteCompany("广州分公司");
        com1.add(new HRDepartment("广州分公司人力资源部"));
        com1.add(new FinanceDepartment("广州分公司财务部"));
        root.add(com1);

        ConcreteCompany com2 = new ConcreteCompany("杭州分公司");
        com2.add(new HRDepartment("杭州分公司人力资源部"));
        com2.add(new FinanceDepartment("杭州分公司财务部"));
        root.add(com2);
    }
}
