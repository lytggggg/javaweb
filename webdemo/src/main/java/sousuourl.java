import com.alibaba.fastjson.JSON;
import lei.url;
import qiaoliangService.qiaoLiangService;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLEncoder;

//////////数据共享cookie
//////////////
@WebServlet("/selectServlet/sousuourl")
public class sousuourl extends HttpServlet {
    qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br = request.getReader();
        String params = br.readLine();
        // 将JSON字符串转为Java对象
        map u = JSON.parseObject(params, map.class);
       url a =qiaoLiangService.selecturls(u.getLnglat()[1]);
        System.out.println(a);


            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(JSON.toJSONString(a));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
