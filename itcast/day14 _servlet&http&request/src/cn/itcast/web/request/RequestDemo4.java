package cn.itcast.web.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //演示获取请求头数据:user-agent
        String referer = req.getHeader("referer" );
        System.out.println(referer);
        if(referer !=null){
            if(referer.contains("/day14")){
                //System.out.println("播放电影...");
                resp.getWriter().write( "播放电影");
            }else {
                //System.out.println("想看电影吗？来这里哦！");
                resp.getWriter().write( "想看电影吗？来这里哦！");
            }
        }
    }
}