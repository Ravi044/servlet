import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

public class Reg extends HttpServlet {
    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("First Name");
        String lastName = req.getParameter("Last Name");
        String gender = req.getParameter("Gender");
        String eMail = req.getParameter("E Mail");
        String uName = req.getParameter("User Name");
        String pwd = req.getParameter("Password");
        if (uName.equals("ravi")&& pwd.equals("king")){
           RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
           rd.forward(req, resp);
        }else {
            System.out.println("Sorry ");
            RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
            rd.include(req,resp);


        }



    }*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw = resp.getWriter();
        System.out.println("change check");



    }
}
