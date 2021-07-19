package autodi;

/**
 * 用来测试自动注入
 */
public class StudentServiceImpl implements StudentService{

    private StudentDAO studentDAO;
    private StudentDAO studentDAONew;

    public void setStudentDAONew(StudentDAO studentDAONew) {
        this.studentDAONew = studentDAONew;
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void save(String name) {
        System.out.println("Service name = " + name);
        studentDAO.save(name);
        studentDAONew.save(name);
    }
}
