package addServlet;

import Ser.ser;
import com.alibaba.fastjson.JSON;
import lei.type;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

////////////////添加桥梁资料卡////////////////
////////////////////////////
////////////////////////////
@WebServlet("/addServlet/typeadd")
public class typeadd extends HttpServlet {
    ser ser = new ser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        BufferedReader br = request.getReader();
        String params = br.readLine();

        type u = JSON.parseObject(params, type.class);

        System.out.println(u);
        ser.typeadd(u);

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
