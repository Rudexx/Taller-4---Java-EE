package co.edu.unbosque.Taller_4_Nuevo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(name = "prueba", value = "/prueba")
public class PruebaCookie extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello World!";
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        resp.setContentType("text/html");
        String userName = req.getParameter("usuario");

        try{
            PrintWriter out = resp.getWriter();

            Cookie c1 = new Cookie("usuario" , userName);
            resp.addCookie(c1);

            out.println("<a href='main.html'> Ingreso de Imagen</a> ");

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void destroy() {
    }
}
