package Controller.AdminPanel;

import DAO.StudentOperation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

@WebServlet(urlPatterns = "/AdminPanel/showallstudents.do")
public class ShowAllStudents extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentOperation sts =new StudentOperation();
        List res  = (sts.selectAllStudents());
        ListIterator it = res.listIterator();
        req.setAttribute("it",it);
        req.getRequestDispatcher("/WEB-INF/AdminPanel/ShowAllStudents.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentOperation sts =new StudentOperation();
        String name = req.getParameter("search");
        List res = sts.searchByName(name);
        ListIterator it;
        String message;
        if(!res.isEmpty())
        {   it = res.listIterator();
            req.setAttribute("it",it);
            message = "The matching results are";
        }
        else
        {
            message="No matching records found";
        }
        req.setAttribute("message",message);

        req.getRequestDispatcher("/WEB-INF/AdminPanel/ShowAllStudents.jsp").forward(req,resp);
    }
}
