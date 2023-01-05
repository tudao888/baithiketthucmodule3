package com.example.baithiketthucmodule3.Controller;

import com.example.baithiketthucmodule3.DAO.StudentDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = req.getParameter("stringSearch");
        req.setAttribute("students", StudentDAO.search(str));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/showListStudent.jsp");
        requestDispatcher.forward(req,resp);
    }
}
