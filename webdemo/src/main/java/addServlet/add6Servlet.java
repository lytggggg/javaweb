package addServlet;


import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.Qiao5;
import lei.cheak;
import lei.xunjian;
import qiaoliangService.qiaoLiangService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

///////////////////////添加down卡////////////////
//////////////////////
/////////////////////
@WebServlet("/addServlet/add6Servlet")
public class add6Servlet extends HttpServlet {
    qiaoliangService.qiaoLiangService qiaoLiangService = new qiaoLiangService();
    ser ser = new ser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String params = br.readLine();
        System.out.println(params);
        xunjian u = JSON.parseObject(params, xunjian.class);

        cheak c = new cheak();
        c.setQiaoliaoKaID(u.getQiaoliaoKaID());
        c.setCheak_date(u.getCheak_date());
        c.setName(ser.selectbyid(u.getQiaoliaoKaID()).getName());
        c.setYanghu_danwei(u.getYanghu_danwei());
        c.setCheak_person(u.getCheak_person());
       // c.setJindu(u.getJindu());
        if(ser.selectCheakById(u.getQiaoliaoKaID())!=null){
            qiaoLiangService.addXunJian(u);
        }else{
            qiaoLiangService.addCheak(c);
            qiaoLiangService.addXunJian(u);
        }


        System.out.println(u);
        if (u != null) {
            response.getWriter().write("1");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
