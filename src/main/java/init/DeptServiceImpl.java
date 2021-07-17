package init;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DeptServiceImpl implements DeptService{

    // 依赖谁就将谁作为成员变量在类中进行声明,并提供公开的set方法,然后在xml文件中完成赋值
    private DeptDAO deptDAO;
    // SET注入语法
    private String name;
    private Double price;
    private Boolean sex;
    private Date bir;
    // 注入数组
    private String[] qqs; //基本类型数组
    private DeptDAO[] deptDAOS; //引用类型数组
    // 注入list集合
    private List<String> habbys;
    private List<DeptDAO> deptDAOList;
    // 注入map
    private Map<String,String> maps;
    // Properties
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setDeptDAOList(List<DeptDAO> deptDAOList) {
        this.deptDAOList = deptDAOList;
    }

    public void setHabbys(List<String> habbys) {
        this.habbys = habbys;
    }

    public void setDeptDAOS(DeptDAO[] deptDAOS) {
        this.deptDAOS = deptDAOS;
    }

    public void setQqs(String[] qqs) {
        this.qqs = qqs;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public void setDeptDAO(DeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }

    @Override
    public void save(String name) {
        System.out.println("Service name = " + name);
//        deptDAO.save("ceshi");
        deptDAO.save(name);
        System.out.println("this.name = " + this.name);
        System.out.println("price = " + price);
        System.out.println("sex = " + sex);
        System.out.println("-------   日期类型   在Spring技术栈中日期格式默认为yyyy/MM/dd HH:mm:ss------");
        System.out.println("bir = " + bir);
        System.out.println("=====================遍历数组========================");
        System.out.println("-------基本类型数组------");
        for(String qq : qqs){
            System.out.println("qq = " + qq);
        }
        System.out.println("-------引用类型数组------");
        for (DeptDAO deptDAO : deptDAOS) {
            System.out.println("deptDAO = " + deptDAO);
        }
        System.out.println("=====================遍历集合========================");
        System.out.println("-------基本类型集合------");
        habbys.forEach(habby -> System.out.println("habby = " + habby));
        System.out.println("-------引用类型集合------");
        deptDAOList.forEach(deptDAOlist -> System.out.println("deptDAOlist = " + deptDAOlist));
        System.out.println("-------    map    ------");
        maps.forEach((key,value) -> System.out.println("key: " + key + ", value: " + value));
        System.out.println("=====================遍历properties集合(无序)  特殊的map========================");
        properties.forEach((key,value) -> System.out.println("key: " + key + ", value: " + value));
    }
}
