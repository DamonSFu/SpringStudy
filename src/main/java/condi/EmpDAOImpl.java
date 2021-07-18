package condi;

public class EmpDAOImpl implements EmpDAO{
    @Override
    public void save(String name) {
        System.out.println("name = " + name);
    }
}
