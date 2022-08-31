package selectQiaoSevlet;

import Ser.ser;
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
@WebServlet("/selectQiaoServlet/sousuoqiao")
public class sousuoqiao extends HttpServlet {

    private qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();
    ser s=new ser();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("qiaoliaoKaID");
        // 将JSON字符串转为Java对象
        int qiaoliaoKaID = Integer.parseInt(id);
        List<Qiao>  q= s.selectbyid1(qiaoliaoKaID);

        String json = JSON.toJSONString(q);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
