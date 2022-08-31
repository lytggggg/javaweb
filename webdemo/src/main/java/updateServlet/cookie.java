
package updateServlet;
import com.alibaba.fastjson.JSON;
import lei.Qiao1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLEncoder;

//////////数据共享cookie
//////////////
@WebServlet("/updateServlet/cookie")
public class cookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BufferedReader br = request.getReader();
        String params = br.readLine();
        // 将JSON字符串转为Java对象
        Qiao1 u = JSON.parseObject(params, Qiao1.class);

        System.out.println(u);
    /*    if (u != null) {
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(JSON.toJSONString(u.getQiaoliaoBianID()));
        }*/
        Cookie cookie = new Cookie("id", URLEncoder.encode(Integer.toString(u.getQiaoliaoKaID()), "UTF-8"));
        //2. 发送Cookie，response
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
