package addServlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao5;
import lei.changguidingjian;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

///////////////////////添加down卡////////////////
//////////////////////
/////////////////////
@WebServlet("/addServlet/add7Servlet")
public class add7Servlet extends HttpServlet {
    qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        changguidingjian u = JSON.parseObject(params, changguidingjian.class);
        qiaoLiangService.addchangguidingjian(u);
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
