package com.example.baithiketthucmodule3.Controller;

import com.example.baithiketthucmodule3.Model.Student;
import com.example.baithiketthucmodule3.Service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/createStudent")
public class CreateStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/formCreate.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        LocalDate dateOfBirth = LocalDate.parse(req.getParameter("dateOfBirth"));
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        int classroom = Integer.parseInt(req.getParameter("classroom"));
        StudentService.save(new Student(id,name,dateOfBirth,address,phone,email,classroom));
        resp.sendRedirect("/showList");
    }
}
