package selectServlet;

import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.Qiao;
import lei.big;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;
////////////////详细信息表*/////////////////////
////////////
//////////////
//////////
@WebServlet("/selectServlet/select2_1Servlet")
public class select2_1Servlet extends HttpServlet {
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
            for (int i = 0; i < u.size(); i++) {
                String name = cookie.getName();
                if ("id".equals(name)) {
                    value = URLDecoder.decode(cookie.getValue(), "UTF-8");
                    System.out.println(name + ":::::" + value);
                    break;
                }
            }
        }
        int id = Integer.parseInt(value);
       // lei.Qiao q = Ser.ser.selectbyid(id);
        big b=ser.selectall(id);
        String json_String = JSON.toJSONString(b);
        response.setContentType("text/json;charset=utf-8");
        System.out.println(json_String);
        response.getWriter().write(json_String);
/*request.setCharacterEncoding("UTF-8");
        BufferedReader br = request.getReader();
        String params = br.readLine();

        // 将JSON字符串转为Java对象

        lei.Qiao qiao = JSON.parseObject(params, lei.Qiao.class);
        if (qiao != null) {
            System.out.println(qiao);
            selectQiaoSevlet.qiaoliangService.qiaoLiangService.updateQiao(qiao, id);
        }*/


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
