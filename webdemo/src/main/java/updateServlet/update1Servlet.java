package updateServlet;

import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.Qiao;
import lei.Qiao1;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

@WebServlet("/updateServlet/update1Servlet")
public class update1Servlet extends HttpServlet {
    private qiaoLiangService qiaoLiangService = new qiaoLiangService();
    private Ser.ser ser = new ser();

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
            /*for (int i = 0; i < u.size(); i++) {*/
            String name = cookie.getName();
            if ("id".equals(name)) {
                value = URLDecoder.decode(cookie.getValue(), "UTF-8");
                System.out.println(name + ":" + value);
                break;
                /*  }*/
            }
        }
        int id = Integer.parseInt(value);
       /* lei.Qiao q = Ser.ser.selectbyid(id);
        //  lei.big b=Ser.ser.selectall(id);
        String json_String = JSON.toJSONString(q);
        response.setContentType("text/json;charset=utf-8");
        System.out.println(json_String);
        response.getWriter().write(json_String);
*/


        request.setCharacterEncoding("UTF-8");
        BufferedReader br = request.getReader();
        String params = br.readLine();

        // 将JSON字符串转为Java对象

        Qiao1 qiao = JSON.parseObject(params, Qiao1.class);
        if (qiao != null) {
            System.out.println(qiao);
            qiaoLiangService.updateQiao1(qiao, id);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
