package selectQiaoSevlet;

import com.alibaba.fastjson.JSON;
import lei.Qiao;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

////////// 查询桥梁资料卡/////////////
//////////////////////////
//////////////////////////

@WebServlet("/selectQiaoSevlet/selectQiaoServlet")
public class selectQiaoServlet extends HttpServlet {
    private qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();

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
        List<Qiao> u = qiaoLiangService.selectQiao();
        String jsonString = JSON.toJSONString(u);
        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

        Map<String,Object> paramMap=new HashMap<>();
        for(int i=0;i<u.size();i++){
            paramMap.put("id"+i+"",u.get(i).getQiaoliaoKaID());
            paramMap.put("name"+i+"",u.get(i).getName());
            paramMap.put("place"+i+"",u.get(i).getPlace());
            paramMap.put("road"+i+"",u.get(i).getRoad_place());
        }
        String s = paramToString(paramMap);
        System.out.println(s);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }


}
