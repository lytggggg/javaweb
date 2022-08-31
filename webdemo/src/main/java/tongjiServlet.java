import com.alibaba.fastjson.JSON;
import lei.tongji;
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

@WebServlet("/tongjiServlet")
public class tongjiServlet extends HttpServlet {
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
        List<tongji> u = qiaoLiangService.selectTongji();
        for (int i = 0; i <u.size() ; i++) {
            if (u.get(i).getProduct().equals("qiaomingpai")) {
                u.get(i).setProduct("桥名牌");
            } else if (u.get(i).getProduct().equals("xiangao")) {
                u.get(i).setProduct("限高");
            } else if (u.get(i).getProduct().equals("renxingdao")) {
                u.get(i).setProduct("人行道");
            } else if (u.get(i).getProduct().equals("chexingdao")) {
                u.get(i).setProduct("车行道");
            } else if (u.get(i).getProduct().equals("shensuofeng")) {
                u.get(i).setProduct("伸缩缝");
            } else if (u.get(i).getProduct().equals("langan")) {
                u.get(i).setProduct("栏杆");
            } else if (u.get(i).getProduct().equals("down")) {
                u.get(i).setProduct("下部结构");
            } else if (u.get(i).getProduct().equals("qiaolulianjieweizhi")) {
                u.get(i).setProduct("桥路连接位置");
            } else if (u.get(i).getProduct().equals("top")) {
                u.get(i).setProduct("上部结构");
            }else if(u.get(i).getProduct().equals("zhizuo")){
                u.get(i).setProduct("支座");
            }
        }

        String jsonString = JSON.toJSONString(u);

        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }


}
