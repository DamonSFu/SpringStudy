package scope;

public class TagDAOImpl implements TagDAO{
    @Override
    public void save(String name) {
        System.out.println("DAO name = " + name);
    }

    // init
    public void init0719() {
        System.out.println("组件对象初始化");
    }
    // destroy
    public void destory() {
        System.out.println("组件对象销毁");
    }
}
