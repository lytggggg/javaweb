import Ser.ser;
import lei.Qiao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

////////////表单验证//////////
////////////////////
///////////////////
//////////////////
@WebServlet("/jianChaServlet")
public class jianChaServlet extends HttpServlet {


    private ser ser = new ser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String qiaoliaoKaID = request.getParameter("qiaoliaoKaID");
        int id = Integer.parseInt(qiaoliaoKaID);
        Qiao q = ser.selectbyid(id);
        //3. 响应标记
        if (q != null) {
            response.getWriter().write(qiaoliaoKaID);
        }

        System.out.println(q);

        System.out.println(qiaoliaoKaID);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
