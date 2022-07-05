package com.servlets;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class FirstServlet implements Servlet {
    ServletConfig conf;

    //Life Cycle Methods
    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("Creating Servlet Object....");
        this.conf = conf;
    }

    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
        System.out.println("Servlet is Servicing......");
        //Set the content-Type of the response
        arg1.setContentType("text/html");
        PrintWriter out = arg1.getWriter();
        out.println("<h1>This is my FirstServlet output by implementing servlet interface</h1>");
        out.println("<h1>Today's Date & Time : " + new Date().toString() + "</h1>");
    }

    //Non-Life Cycle Methods
    public void destroy() {
        System.out.println("Destroying servlet object.....");
    }

    public ServletConfig getServletConfig() {
        return this.conf;
    }

    public String getServletInfo() {
        return "This Servlet is created by Tien Dat";
    }
}