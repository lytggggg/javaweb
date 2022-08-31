import com.alibaba.fastjson.JSON;
import lei.cheak;
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

@WebServlet("/selectCheakServlet")
public class selectCheakServlet extends HttpServlet {
    private qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<cheak> u = qiaoLiangService.selectCheak();
        System.out.println(u);
        for (int i = 0; i < u.size(); i++) {
            double a=Double.parseDouble(u.get(i).getJindu());
            double b=a*100;

            String c = b + "%";
            u.get(i).setJindu(c);
        }
        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }


}
