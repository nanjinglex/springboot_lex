package com.example.springboottest;

import com.example.springboottest.dao.MongoTestDao;
import com.example.springboottest.pojo.MongoTest;
import com.example.springboottest.service.UserService;
import com.example.springboottest.util.HttpClientUtil;
import io.itit.itf.okhttp.FastHttpClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootTestApplicationTests {

    @Resource
    private UserService userService;

    @Autowired
    private MongoTestDao mongoTestDao;

//配置test.list不存在会报错
    @Value("#{'${test.list}'.split(',')}")
    private List<String> testList;

    //配置test.list不存在会给一个默认值,
    @Value("#{'${test.list:}'.split(',')}")
    private List<String> testList1;

//最终版
    @Value("#{'${test.list:}'.empty ? null : '${test.list:}'.split(',')}")
    private List<String> testList2;



    @Test
    public void selectAll111(){
        mongoTestDao.findAll();
    }

    @Test
    public void selectPage(){
        int i = mongoTestDao.selectCount(44);
        System.out.println(String.format("总记录数：%d",i));
       List<MongoTest> mgtest= mongoTestDao.findTestByAge(44,0,10);
        System.out.println(mgtest.size());
        mgtest.forEach(mongoTest -> System.out.println(mongoTest));


    }

    @Test
    public void selectAll() {
        System.out.println(userService.selectAll());
        System.out.println(userService.selectByCondition());
    }



    @Test
    void contextLoads() {
    }


    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Test
    public void insert() {
        List<Object[]> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            //name age sex
            String[] s = {i+"张三",20+"","男"};
            list.add(new Object[]{s[0],s[1],s[2]});
        }



        //执行批量插入操作
        String sql = "INSERT INTO `student`(`name`,`age`,`sex`) VALUES (?,?,?)";
        jdbcTemplate.batchUpdate(sql, list);


    }


    /**
     * GET---无参测试
     *
     * @date 2018年7月13日 下午4:18:50
     */
    @Test
    public void httpTest() {
        String url="http://localhost:18080/verification/job/queryAllJobs";
        try {
            String resp= FastHttpClient.get().url(url).build().execute().string();
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


        String s = HttpClientUtil.doGet(url);
        System.out.println(s);

        //1.入参 jobId、ipPorts
        String jobId = "201";
        String[] ipPorts = {"localhost:18080","localhost:18081"};


        Map<String, Object> param = new HashMap<>();
        param.put("jobId","201");

        String postUrl = null;
        for (String s2 : ipPorts) {
            postUrl = "http://"+s2+"/verification/elasticjob/pushJobToRegCenter";
            String resullt = HttpClientUtil.doPost(postUrl, param);
            System.out.println(resullt);
        }





    }

    @Test
    public void valueTest(){
        testList.stream().forEach(System.out::println);

    }




}
