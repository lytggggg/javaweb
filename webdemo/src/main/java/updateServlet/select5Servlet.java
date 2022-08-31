package updateServlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao3;
import qiaoliangService.qiaoLiangService;
import Ser.ser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;

//////////down表回显数据////////////////
/////////////////////////////
@WebServlet("/updateServlet/select5Servlet")
public class select5Servlet extends HttpServlet {
    private qiaoLiangService qiaoLiangService = new qiaoLiangService();
    private ser ser = new ser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();

        String value = "";
        for (Cookie cookie : cookies) {

            String name = cookie.getName();
            if ("id".equals(name)) {
                value = URLDecoder.decode(cookie.getValue(), "UTF-8");
                System.out.println(name + ":" + value);
                break;

            }
        }
        int id = Integer.parseInt(value);

        Qiao3 q = ser.select4byid(id);
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
