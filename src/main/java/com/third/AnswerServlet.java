package com.third;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name ="AnswerServlet", value = "/answer")
public class AnswerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession curentSession = request.getSession();

        String answer = request.getParameter("answer");
        if("y".equals(answer)){
            response.sendRedirect("logic");
        }else if("n".equals(answer)){
            request.getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response);
        }
    }
}
