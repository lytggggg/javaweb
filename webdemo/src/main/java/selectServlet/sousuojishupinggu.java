package selectServlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao;
import lei.data;
import lei.jishupinggu;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

//////////数据共享cookie
//////////////
@WebServlet("/selectServlet/sousuojishupinggu")
public class sousuojishupinggu extends HttpServlet {

    private qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        BufferedReader br = request.getReader();
        String params = br.readLine();
        // 将JSON字符串转为Java对象
        data u = JSON.parseObject(params, data.class);
        System.out.println(params);
        List<jishupinggu>  jishupinggu= qiaoLiangService.sousuojishupingu(u.getDaterange55378()[0],u.getDaterange55378()[1]);

        System.out.println(JSON.toJSONString(jishupinggu));
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(jishupinggu));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
