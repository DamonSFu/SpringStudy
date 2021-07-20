package staticproxy;

// 原始业务逻辑对象
public class UserServiceImpl implements UserService {

    // 开启事务 处理业务 调用dao

    @Override
    public void save(String name) {
//        try {
//            System.out.println("开启事务");
//            System.out.println("处理业务逻辑,调用DAO~~~");
//            System.out.println("提交事务");
//        }catch (Exception e){
//            System.out.println("回滚事务");
//            e.printStackTrace();
//        }
        // 当有代理后，重复冗余的事务性代码可以交给代理去完成，只用留下处理业务逻辑代码，以下同理
        System.out.println("处理业务逻辑,调用 save DAO~~~");
    }

    @Override
    public void delete(String id) {
//        try {
//            System.out.println("开启事务");
            System.out.println("处理业务逻辑,调用 delete DAO~~~");
//            System.out.println("提交事务");
//        }catch (Exception e){
//            System.out.println("回滚事务");
//            e.printStackTrace();
//        }
    }

    @Override
    public void update() {
//        try {
//            System.out.println("开启事务");
            System.out.println("处理业务逻辑,调用update DAO~~~");
//            System.out.println("提交事务");
//        }catch (Exception e){
//            System.out.println("回滚事务");
//            e.printStackTrace();
//        }
    }

    @Override
    public String findAll(String name) {
//        try {
//            System.out.println("开启事务");
            System.out.println("处理业务逻辑,调用findAll DAO~~~");
//            System.out.println("提交事务");
//        }catch (Exception e){
//            System.out.println("回滚事务");
//            e.printStackTrace();
//        }
        return name;
    }

    @Override
    public String findOne(String id) {
//        try {
//            System.out.println("开启事务");
            System.out.println("处理业务逻辑,调用findOne DAO~~~");
//            System.out.println("提交事务");
//        }catch (Exception e){
//            System.out.println("回滚事务");
//            e.printStackTrace();
//        }
        return id;
    }
}

