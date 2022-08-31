package selectQiaoSevlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao1;
import lei.jishupinggu;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
////////查询一般资料表//////////
/////////////
///////////
////////////

@WebServlet("/selectQiaoSevlet/sousuojspgDemo")
public class sousuojspgDemo extends HttpServlet {
    private qiaoLiangService qiaoLiangService = new qiaoLiangService();

    public String paramToString(Map<String, Object> paramMap) {
        String json;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        Set<String> paramKey = paramMap.keySet();
        for (String param : paramKey) {
            if (paramMap.get(param) != null) {
                stringBuffer.append("\"" + param + "\":\"" + paramMap.get(param).toString().trim() + "\",");
            }
        }
        if (stringBuffer.length() > 2) {
            String substring = stringBuffer.substring(0, stringBuffer.length() - 1);
            json = substring + "}";
        } else {
            json = stringBuffer.toString() + "}";
        }
        return json;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("qiaoliaoKaID");
        int ID = Integer.parseInt(id);
        List<jishupinggu> u = qiaoLiangService.selectjishupinggubyid1(ID);
        System.out.println(u);
        String jsonString = JSON.toJSONString(u);



        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
