package condi;

public class EmpServiceImpl implements EmpService{

    // 一般情况下 要保证有无参构造
    public EmpServiceImpl() {
    }

    // 构造注入语法
    private String name;
    private Integer age;
    private EmpDAO empDAO;
    private String[] qqs;

    public EmpServiceImpl(String name, Integer age, EmpDAO empDAO, String[] qqs) {
        this.name = name;
        this.age = age;
        this.empDAO = empDAO;
        this.qqs = qqs;
    }

    public EmpServiceImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public EmpServiceImpl(String name, Integer age, EmpDAO empDAO) {
        this.name = name;
        this.age = age;
        this.empDAO = empDAO;
    }

    public EmpServiceImpl(String name) {
        this.name = name;
    }

    public EmpServiceImpl(Integer age) {
        this.age = age;
    }

    public EmpServiceImpl(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    @Override
    public void save(String name) {
        System.out.println("name = " + name);
        empDAO.save(name);
        System.out.println("this.name = " + this.name);
        System.out.println("this.age = " + this.age);
        System.out.println("============遍历数组===============");
        for (String qq : qqs) {
            System.out.println("qq = " + qq);
        }

    }
}
