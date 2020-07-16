package Servlets;

import Services.EquipmentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="addEntity",urlPatterns = {"/add"} )
public class EquipmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String producer =  req.getParameter("producer");
        String model =  req.getParameter("model");
        String serial =  req.getParameter("serial");
        String isWorking =  req.getParameter("isWorking");


        EquipmentService insertEquipmentEntity = new EquipmentService();
        String retu = insertEquipmentEntity.Put(producer,model,serial,isWorking);
        resp.getWriter().write(producer+","+model +","+ serial+","+isWorking+retu);
    }
}
