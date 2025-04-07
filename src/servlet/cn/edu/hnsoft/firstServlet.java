package servlet.cn.edu.hnsoft;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "firstservlet",urlPatterns = "/fs")
public class firstServlet extends HttpServlet {
    // 覆盖init方法
    @Override
    public void init() throws ServletException {
        System.out.println("init方法被调用");
        super.init();
    }

    // 覆盖service方法
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service方法被调用");
        super.service(request, response);
    }

    // 覆盖doGet方法
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("  <head><title>Servlet</title></head>");
        out.println("  <body>");
        out.println("<h1>你好，欢迎来到Servlet世界</h1>");
        out.println("  </body>");
        out.println("</html>");
        out.close();
    }

    // 覆盖destroy方法
    @Override
    public void destroy() {
        System.out.println("destroy方法被调用");
        super.destroy();
    }
}
