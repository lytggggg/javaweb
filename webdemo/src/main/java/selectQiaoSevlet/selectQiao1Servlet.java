package selectQiaoSevlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao1;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
////////查询一般资料表//////////
/////////////
///////////
////////////

@WebServlet("/selectQiaoSevlet/selectQiao1Servlet")
public class selectQiao1Servlet extends HttpServlet {
    private qiaoLiangService qiaoLiangService=new qiaoLiangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Qiao1>  u = qiaoLiangService.selectQiao1();
        System.out.println(u);
        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
