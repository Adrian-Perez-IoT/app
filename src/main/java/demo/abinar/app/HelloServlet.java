package demo.abinar.app;
import conexionMySQL.conexionMySQL;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.*;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    conexionMySQL cc = new conexionMySQL();
    Connection con = cc.iniciarConnection();

    /*conexionMySQL cc= new conexionMySQL();
    Connection con = cc.conexion();


    public void insertarDatos(){
        try {
            //String SQL = "insert into MyGuests (firstname, lastname, email) values (adrian, perez, adrianjperez@gmail.com)";
            String SQL = "insert into MyGuests (id, firstname, lastname, email) values (1111,qqqqq,wwwww,ppppp)";
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1,"Adrian");
            pst.setString(2,"Perez");
            pst.setString(3,"perezjadrian@gmail.com");
            pst.execute();
            JOptionPane.showMessageDialog(null,"Registro Exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro" + e.getMessage());
        }
    }*/



    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        this.insertarDatos();
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}