package addServlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao5;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

///////////////////////添加down卡////////////////
//////////////////////
/////////////////////
@WebServlet("/addServlet/add5Servlet")
public class add5Servlet extends HttpServlet {
    qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        Qiao5 u = JSON.parseObject(params, Qiao5.class);
        qiaoLiangService.addQiao5(u);
        System.out.println(u);
        if (u != null) {
            response.getWriter().write("1");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
