package updateServlet;

import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.Qiao;
import lei.Qiao1;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;
//////////一般资料表回显数据////////////////
/////////////////////////////
@WebServlet("/updateServlet/select3Servlet")
public class select3Servlet extends HttpServlet {
    private qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();
    private ser ser = new ser();

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
                    System.out.println(name + ":" + value);
                    break;
                }
            }
        }
        int id = Integer.parseInt(value);

        Qiao1 q = ser.select2byid(id);
        //lei.big b=Ser.ser.selectall(id);
        String json_String = JSON.toJSONString(q);
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
