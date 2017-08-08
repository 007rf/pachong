import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhiHuUserSprider.service.spriderService;
import zhiHuUserSprider.service.util.ExcelUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by renfei on 17/8/7.
 */
public class DafeiTest {
//
    @Test
//    @Ignore
    public void test() {
        try {
            spriderService.main(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String []args) throws IOException {
        String s1 = fun("/Users/renfei/niudeshuju.txt");
        String s2 = fun("/Users/renfei/IdeaProjects/ZhiHuSpider/niudeshuju1.txt");
        String s3 = fun("/Users/renfei/IdeaProjects/ZhiHuSpider/niudeshuju2.txt");
        String []str1s = s1.split("\n");
        String []str2s = s2.split("\n");
        String []str3s = s3.split("\n");
        List<String> list = new LinkedList<>();

        for (String s : str1s) {
            list.add(s);
        }
        for (String s : str2s) {
            list.add(s);
        }
        for (String s : str3s) {
            list.add(s);
        }

        Set<String> filedSet = new LinkedHashSet<>();
        filedSet.add("answersNum");
        filedSet.add("askNum");
        filedSet.add("business");
        filedSet.add("collumnNum");
        filedSet.add("company");
        filedSet.add("education");
        filedSet.add("followersNum");
        filedSet.add("followingNum");
        filedSet.add("havePublicAccount");
        filedSet.add("major");
        filedSet.add("name");
        filedSet.add("position");
        filedSet.add("sex");
        filedSet.add("shareNum");
        filedSet.add("starsNum");
        filedSet.add("thxNum");

        Object [][]objects = new Object[list.size() + 1][filedSet.size()];

        int i = 0;
        for (String filed : filedSet) {
            objects[0][i++] = filed;
        }

        int j = 1;
        for (String str : list) {
            System.out.println(str);
            JSONObject jsonObject = JSONObject.parseObject(str);
            int k = 0;
            for (String filed : filedSet) {
                String value = jsonObject.getString(filed);
                if (StringUtils.isEmpty(value)) {
                    value = "";
                }
                if (filed.equals("starsNum")) {
                    if (value.length() > 10) {
                        String []ss = value.split("获得");
                        value = ss[ss.length - 1];
                    }
                }

                if (filed.equals("collumnNum")) {
                    if (value.length() > 10) {
                        String []ss = value.split("专栏");
                        value = ss[ss.length - 1];
                    }
                }

                objects[j][k++] = value;
            }
            j++;
        }


        ExcelUtils.downloadReport(objects, "牛的数据.xls");
    }

    public static String fun(String s) throws IOException {
        InputStream in = new FileInputStream(s);

        byte[] data2 = new byte[in.available()];
        in.read(data2);
        in.close();
        return new String(data2);
    }

}
