package com.third;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InitServlet",value = "/start")
public class InitServlet extends HttpServlet {
    @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession  curenSesion = request.getSession(true);
        Questions questions = new Questions();
        curenSesion.setAttribute("quest",questions);// заносим в атрибут сеcсии treeMap со значениями
        // пропертей в правильном порядке
        //перенапрвление запроса   на страницу index.jsp через сервер
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
