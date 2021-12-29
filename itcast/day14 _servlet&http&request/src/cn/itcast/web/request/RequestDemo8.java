package cn.itcast.web.request;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println( "demo8888被访间了。. 。");
        //转发到demo9资源
    /*    RequestDispatcher requestDispatcher = req.getRequestDispatcher( "/requestDemo9");
        requestDispatcher.forward( req,resp) ;*/

        //存储数据到request域中
        req.setAttribute("msg","he11o" );
        req.getRequestDispatcher("/requestDemo9").forward(req,resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doPost(req,resp);
    }
}