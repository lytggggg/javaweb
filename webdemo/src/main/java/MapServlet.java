import com.alibaba.fastjson.JSON;
import lei.cheak;
import lei.url;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
////////查询一般资料表//////////
/////////////
///////////
////////////

@WebServlet("/MapServlet")
public class MapServlet extends HttpServlet {
    private qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<url> u = qiaoLiangService.selecturl();
        System.out.println(u);
        List<map> map2=new ArrayList<>();
        for(int i=0;i<u.size();i++){
            String a[]=new String[2];
            String b=u.get(i).getUrl();
           a[0]=u.get(i).getJd();
           a[1]=u.get(i).getWd();
           map m=new map();
           m.setLnglat(a);
           m.setUrl(b);
           map2.add(m);
        }


        System.out.println(map2);
        String jsonString = JSON.toJSONString(map2);
        System.out.println(jsonString);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }


}
