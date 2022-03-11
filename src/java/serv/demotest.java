/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import been.demoBeenLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
@WebServlet(name = "demotest", urlPatterns = {"/demotest"})
public class demotest extends HttpServlet {
    
    @EJB demoBeenLocal dbl;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet demotest</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<form action = '' method = 'post'>");
            out.println("<input type='text' name=name placeholder=name />");
            out.println("</br>");
            out.println("<input type='text' name=price placeholder=price />");
            out.println("</br>");
            out.println("<input type='submit' name=submit value=submit />");
            out.println("</form>");
  
            String name = request.getParameter("name");  
            String price = request.getParameter("price");
            
            int i = Integer.parseInt(price);
            
            if(request.getMethod().equals("POST")){
                dbl.insertData(name, i);
                out.println("<h1>Data Inserted..</h1>");
            }
            
//            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
//            Date date = new Date();
//            dbl.insert("test", 50, date);
//            dbl.insertData("test", 50);
            out.println("<h1>Servlet demotest at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
