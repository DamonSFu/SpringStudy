package aop;

// 原始业务对象 目标对象
public class EmpServiceImpl implements EmpService{
    @Override
    public void save(String name) {
        System.out.println("处理业务逻辑 调用save DAO name : " + name);
    }

    @Override
    public String find(String name) {
        System.out.println("处理业务逻辑 调用find DAO name : " + name);
        return name;
    }
}
