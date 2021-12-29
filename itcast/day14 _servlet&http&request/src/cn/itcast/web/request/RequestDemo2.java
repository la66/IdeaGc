package cn.itcast.web.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //演示获取求头数据
        //1.获取所有请求头名称
        Enumeration<String> headerNames = req.getHeaderNames();
        //便历
        while (headerNames.hasMoreElements()){
            String name=headerNames.nextElement();
            //根据名称获取请求头的值
            String value=req.getHeader(name);
            System.out. println(name+"---"+value);
        }
    }
}
