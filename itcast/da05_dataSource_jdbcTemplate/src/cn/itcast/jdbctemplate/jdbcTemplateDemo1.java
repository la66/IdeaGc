package cn.itcast.jdbctemplate;

import cn.itcast.utils.jdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * jdbcTemplate 入门学习
 * */
public class jdbcTemplateDemo1 {
    public static void main(String[] args) {
        //导入jar包
        //2，创建jdbcTemplate对象
        JdbcTemplate template = new JdbcTemplate(jdbcUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance = 5088 where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count) ;

    }
}
