import com.alibaba.fastjson.JSON;
import lei.tongji;
import lei.tongji2;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
////////查询一般资料表//////////
/////////////
///////////
////////////

@WebServlet("/tongji2Servlet")
public class tongji2Servlet extends HttpServlet {
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
        List<tongji2> u = qiaoLiangService.selectTongji2();
        for(int i=0;i< u.size();i++){
            if(u.get(i).getName().equals("qiaomingpai")){
                u.get(i).setName("桥名牌");
            }else if(u.get(i).getName().equals("xiangao")){
                u.get(i).setName("限高");
            }else if(u.get(i).getName().equals("renxingdao")){
                u.get(i).setName("人行道");
            }else if(u.get(i).getName().equals("chexingdao")){
                u.get(i).setName("车行道");
            }else if(u.get(i).getName().equals("shensuofeng")){
                u.get(i).setName("伸缩缝");
            }else if(u.get(i).getName().equals("langan")){
                u.get(i).setName("栏杆");
            }else if(u.get(i).getName().equals("down")){
                u.get(i).setName("下部结构");
            }else if(u.get(i).getName().equals("qiaolulianjieweizhi")){
                u.get(i).setName("桥路连接位置");
            }else if(u.get(i).getName().equals("top")){
                u.get(i).setName("上部结构");
            }else if(u.get(i).getName().equals("zhizuo")){
                u.get(i).setName("支座");
            }
        }
        String jsonString = JSON.toJSONString(u);

        System.out.println(u);
        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }


}
