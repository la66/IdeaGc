package cn.itcast.jdbctemplate;

import cn.itcast.domain.Emp;
import cn.itcast.utils.jdbcUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class jdbcTemplateDemo2 {
    //junit单元测试

    //1．获取DBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(jdbcUtils.getDataSource());
    /*
    *1．修改1号数据的salary为10000
    * */

    @Test
    public void test1(){
        //System.out.println("我被执行了。。。");

        //定义aql
        String sql = "update emp set salary = 10000 where id = 1001";
        //3．执行sql
        int count = template.update(sql);
        System.out.println( count);


    }
    @Test
    public void test2(){
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int count = template.update(sql,1015,"郭靖",10);
        System.out.println(count);
    }
    /**
     * 删除刚才添加的记录
     */
    @Test
    public void test3(){
        String sql = "delete from emp where id = ?";
        int count = template.update(sql,1015);
        System.out.println( count) ;
    }

    /**
     * 4 .查询id为1的记录，将其封装为Map集合
     */
    @Test
    public void test4(){
        String sql = "select* from emp where id = ?";
        Map<String,Object> map = template.queryForMap(sql, 1001);
        System. out.println(map);
    }
    /**
     * 5.查询所有的集合，将其封装为list
     */
    @Test
    public void test5(){
        String sql = "select * from emp" ;
        List<Map<String,Object>> list = template.queryForList(sql);
        for(Map<String, Object> stringObjectMap : list){
            System.out.println(stringObjectMap) ;
        }
    }
    @Test
    public void test6(){
        String sql = "select * from emp" ;
        List<Emp> list = template.query(sql,new BeanPropertyRowMapper<Emp>(Emp.class));
        for ( Emp emp : list) {
            System.out.println(emp);
        }
    }
    /*
    * 7.查询总记录数
    * */
    @Test
    public void test7(){
        String sql = "select count (id) from emp" ;
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
