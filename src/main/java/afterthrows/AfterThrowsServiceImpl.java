package afterthrows;

public class AfterThrowsServiceImpl implements AfterThrowsService{
    @Override
    public void save(String name) {
        System.out.println("业务层Service save " + name);
//        throw new RuntimeException("用来测试异常通知---save方法调用出错");
    }

    @Override
    public String find(String name) {
        System.out.println("业务层Service find " + name);
        throw new RuntimeException("用来测试异常通知---find方法调用出错");
        //return name;
    }
}
