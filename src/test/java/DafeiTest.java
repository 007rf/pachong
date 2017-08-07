import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhiHuUserSprider.service.spriderService;

/**
 * Created by renfei on 17/8/7.
 */
public class DafeiTest {

    @Test
//    @Ignore
    public void test() {
        try {
            spriderService.main(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
