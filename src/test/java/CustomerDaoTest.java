import org.example.board.dao.CustomerDao;
import org.example.board.vo.CustomerVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "file:src/main/webapp/WEB-INF/spring-config/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/spring-config/dispatcher-servlet.xml"
})
public class CustomerDaoTest {

    @Autowired
    private CustomerDao dao;

    @Test
    public void test() {
        CustomerVo c = dao.selectByName("kim");
        System.out.println(c);
        System.out.println(c.getID());
        System.out.println(c.getName());
        System.out.println(c.getAge());
    }
}
