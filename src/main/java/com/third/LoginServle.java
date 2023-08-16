package com.third;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

@WebServlet(name = "loginServlet",value="/login")
public class LoginServle extends HttpServlet {
    int count =0;
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // в index.jsp была форма, которая направила post запрос на это сервлет. И из этого запроса мы вытащили
        // переданное имя которое вводили в форму.
        HttpSession curenSesion=request.getSession();
        String username = request.getParameter("firstname");
        if(username==""&& count<=3){
            count++;
        getServletContext().getRequestDispatcher("/index1.jsp").forward(request, response);
        }else if(count==4){
            curenSesion.setAttribute("badChoise","Well.. you lost");
            getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response);
        }
        Player player = new Player(username);
        HttpSession curentSesion = request.getSession();
        String playerName = player.getName();
        String serialNumberOfTheGameSession = player.getValue();
        curentSesion.setAttribute("playerName",playerName);
        curentSesion.setAttribute("sessionNumber",serialNumberOfTheGameSession);
        response.sendRedirect("logic");//перенаправляет на сервлет LogicServlet

/*           всё это было  для проверки
        // get response writer
        PrintWriter writer = response.getWriter();
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + "<br/>";
        htmlRespone += "</html>";

        // return response
        writer.println(htmlRespone);
        */

    }
}
