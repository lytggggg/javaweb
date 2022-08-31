package updateServlet;

import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.Qiao5;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;

////////// down表回显数据////////////////
/////////////////////////////
@WebServlet("/updateServlet/select7Servlet")
public class select7Servlet extends HttpServlet {
  private qiaoLiangService qiaoLiangService = new qiaoLiangService();
  private Ser.ser ser = new ser();

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

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

    Qiao5 q = ser.select6byid(id);
    // lei.big b=Ser.ser.selectall(id);
    String json_String = JSON.toJSONString(q);
    response.setContentType("text/json;charset=utf-8");
    System.out.println(json_String);
    response.getWriter().write(json_String);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doGet(request, response);
  }
}
