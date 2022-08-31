package selectServlet;

import lei.xunjian;
import qiaoliangService.qiaoLiangService;
import Ser.ser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

////////// down表回显数据////////////////
/////////////////////////////
@WebServlet("/selectServlet/select8Servlet")
public class select8Servlet extends HttpServlet {
    private qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();
    private ser ser = new ser();

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

        List<xunjian> u = qiaoLiangService.selectXunJian(id);
        Map<String, Object> paramMap = new HashMap<>();
        for (int i = 0; i < u.size(); i++) {
            if (u.get(i).getJianchaxiang().equals("xiangao")) {
                paramMap.put("state" + 1 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 1 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 1 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 1 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 1 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("renxingdao")) {
                paramMap.put("state" + 2 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 2 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 2 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 2 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 2 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("qiaomingpai")) {
                paramMap.put("state" + 0 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 0 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 0 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 0 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 0 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("chexingdao")) {
                paramMap.put("state" + 3 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 3 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 3 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 3 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 3 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("shensuofeng")) {
                paramMap.put("state" + 4 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 4 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 4 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 4 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 4 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("langan")) {
                paramMap.put("state" + 5 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 5 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 5 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 5 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 5 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("paishuisheshi")) {
                paramMap.put("state" + 6 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 6 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 6 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 6 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 6 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("qiaolulianjieweizhi")) {
                paramMap.put("state" + 7 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 7 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 7 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 7 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 7 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("top")) {
                paramMap.put("state" + 8 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 8 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 8 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 8 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 8 + "", u.get(i).getWeizhi());
            } else if (u.get(i).getJianchaxiang().equals("down")) {
                paramMap.put("state" + 9 + "", String.format("%1$7s", u.get(i).getState()));
                paramMap.put("bad" + 9 + "", u.get(i).getBad());
                paramMap.put("chengdu" + 9 + "", u.get(i).getChengdu());
                paramMap.put("weizhi" + 9 + "", u.get(i).getWeizhi());
                paramMap.put("beizhu" + 9 + "", u.get(i).getWeizhi());
            }

        }
        paramMap.put("input46484", id);
        String s = paramToString(paramMap);
        System.out.println(s);
        // lei.big b=Ser.ser.selectall(id);
        //  String json_String = JSON.toJSONString(q);
        response.setContentType("text/json;charset=utf-8");
        //  System.out.println(json_String);
        response.getWriter().write(s);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
}
