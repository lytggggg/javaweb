package selectServlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;
/////////////删除桥梁资料卡///////////////
///////////////////////////
///////////////////////////
@WebServlet("/selectServlet/deletejishupinggu")
public class deletejishupinggu extends HttpServlet {
    private qiaoLiangService qiaoLiangService = new qiaoLiangService();
    //  private Ser.ser Ser.ser = new Ser.ser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        //2. 遍历数组
        List<Qiao> u = qiaoLiangService.selectQiao();

        String jsonString = JSON.toJSONString(u);
        // response.setContentType("text/json;charset=utf-8");
        // response.getWriter().write(jsonString);
        String value = "";
        for (Cookie cookie : cookies) {
            //    for (int i = 0; i < u.size(); i++) {
            String name = cookie.getName();
            if ("id".equals(name)) {
                value = URLDecoder.decode(cookie.getValue(), "UTF-8");
                System.out.println(name + ":" + value);
                break;
                //  }
            }
        }
        int id = Integer.parseInt(value);

        qiaoLiangService.deletejishupinggu(id);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
