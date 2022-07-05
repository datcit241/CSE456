package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Success extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>You are in Success Page:<br>");
        out.println("<br><h2>Thank You:<br>");
    }
}