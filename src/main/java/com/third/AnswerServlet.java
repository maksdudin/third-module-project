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
        Player curentPlayer= (Player) curentSession.getAttribute("player");
        String answer = request.getParameter("answer");
        if("y".equals(answer)){
            response.sendRedirect("logic");
        }else if("n".equals(answer)){
            curentPlayer.setLose(1);// изменили значение проигрыша на один
            curentPlayer.serMap(curentPlayer);// отдали команду на запись параметров
            request.getServletContext().getRequestDispatcher("/table3.jsp").forward(request, response);
        }
    }
}
