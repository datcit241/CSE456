package com.servlets;

import java.io.*;
import javax.servlet.http.*;

public class ThirdServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        PrintWriter out = res.getWriter();
        if (age >= 18) {
            System.out.println();
            out.println("Hii..." + name + ". You are eligible for vote");
        } else {
            System.out.println();
            out.println("Hii..." + name + ". You are not eligible for vote");
        }
    }
}