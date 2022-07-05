package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("This is post method...");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>Welcome to Register Servlet</h2><br>");

        String name = req.getParameter("name");
        String user_name = req.getParameter("user_name");
        String pwd = req.getParameter("pwd");
        String gender = req.getParameter("gender");
        String course = req.getParameter("course");
        String condition = req.getParameter("condition");
        if (condition != null) {
            if (condition.equals("checked")) {
                out.println("<h2>Your details are given below:<br>");
                out.println("<h2>Name:" + name + "</h2>");
                out.println("<h2>User_Name:" + user_name + "</h2>");
                out.println("<h2>Password:" + pwd + "</h2>");
                out.println("<h2>Gender:" + gender + "</h2>");
                out.println("<h2>Course:" + course + "</h2>");
                RequestDispatcher rd = req.getRequestDispatcher("Success");
                rd.forward(req, res);
            } else {
                out.println("<h2>Sorry! you have not accepted terms and conditions.</h2>");
            }
        } else {
            out.println("<h2>Sorry! you have not accepted terms and conditions.</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("Register.html");
            rd.include(req, res);
        }
    }
}