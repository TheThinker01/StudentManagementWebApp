package Controller;

import Bean.Student;
import DAO.StudentDeclaration;
import DAO.StudentOperation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/registration_form.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name, address, contact,course,password,admission_date;
        String username;
        Double fees;
        username = req.getParameter("username");
        name = req.getParameter("name");
        address = req.getParameter("address");
        contact = req.getParameter("contact");
        fees = Double.parseDouble(req.getParameter("fees"));
        course = req.getParameter("course");
        password = req.getParameter("password");
        admission_date = req.getParameter("admission_date");
        StudentDeclaration so = new StudentOperation();
        so.insertStudent(new Student(name,address,contact,username,fees,course,password,admission_date));
        // data added here is for the alert that is to be generated in the showMessage.jsp page using bootstrap Alerts
        String mtype = "success";// Set the alert type
        String heading = "Well Done";// Set the heading
        String message = "You have been registered !";//message to be displayed

        req.setAttribute("message",message);
        req.getRequestDispatcher("/WEB-INF/views/showMessage.jsp").forward(req,resp);
    }
}
