package addServlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

////////////////添加桥梁资料卡////////////////
////////////////////////////
////////////////////////////
@WebServlet("/addServlet/addServlet")
public class addServlet extends HttpServlet {
    qiaoLiangService qiaoLiangService=new qiaoLiangService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收用户名和密码
        /*String username = request.getParameter("username");
        String password = request.getParameter("password");
*/
        BufferedReader br = request.getReader();
        String params = br.readLine();
        // 将JSON字符串转为Java对象
        Qiao u = JSON.parseObject(params, Qiao.class);
        //2. 调用MyBatis完成查询
        //2.1 获取SqlSessionFactory对象
        qiaoLiangService.addQiao(u);

        System.out.println(u);
        //获取字符输出流，并设置content type
       /* response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();*/
        //3. 判断user释放为null


        if (u != null) {
            response.getWriter().write("1");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
