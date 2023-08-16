package com.third;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

@WebServlet(name="LogicServlet",value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession curentSessiom=request.getSession();
    Player player;// тут нужно будет добавить метод получения
    Integer countSession;// и тут нужно будет до Questions questions = new Questions();
        Questions quest =(Questions) curentSessiom.getAttribute("quest");
        if (!quest.getQueue().peek().equals(quest.getMap().get("m"))){
        request.setAttribute("question1",quest.getQueue().poll());
        request.setAttribute("question2",quest.getQueue().poll());
        request.setAttribute("question3",quest.getQueue().poll());
        String badChoise = quest.getQueue().poll();
        curentSessiom.setAttribute("badChoise",badChoise);
        curentSessiom.setAttribute("resume","  Haa...haa.. haaa...    you lose.");

        request.getServletContext().getRequestDispatcher("/table1.jsp").forward(request, response);
        }else{
            String badChoise = quest.getQueue().poll();
            curentSessiom.setAttribute("badChoise",badChoise);
            curentSessiom.setAttribute("resume","And...   you win.");
            request.getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response);
        }

    }

    }




