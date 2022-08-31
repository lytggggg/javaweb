package type;

import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.noMust;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
////////查询一般资料表//////////
/////////////
///////////
////////////

@WebServlet("/type/type2")
public class type2 extends HttpServlet {
    private ser ser=new ser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<noMust>  u = ser.selectnomust();
        System.out.println(u);
        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
