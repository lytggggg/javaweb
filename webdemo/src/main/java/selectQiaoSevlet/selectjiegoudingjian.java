package selectQiaoSevlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao1;
import lei.changguidingjian;
import lei.dingjian;
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

@WebServlet("/selectQiaoSevlet/selectjiegoudingjian")
public class selectjiegoudingjian extends HttpServlet {
    private qiaoLiangService qiaoLiangService=new qiaoLiangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<dingjian>  u = qiaoLiangService.selectdingjian();
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
