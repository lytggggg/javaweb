package updateServlet;

import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.Qiao5;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;

@WebServlet("/updateServlet/update5Servlet")
public class update5Servlet extends HttpServlet {
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


        request.setCharacterEncoding("UTF-8");
        BufferedReader br = request.getReader();
        String params = br.readLine();

        // 将JSON字符串转为Java对象

        Qiao5 qiao = JSON.parseObject(params, Qiao5.class);
        if (qiao != null) {
            System.out.println(qiao);
            qiaoLiangService.updateQiao5(qiao, id);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
