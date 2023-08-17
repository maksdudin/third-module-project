package com.third;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="RestartServlet",value = "/restart")
public class RestartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate();//удал€ет из сессии все объекты
        response.sendRedirect("/start");//перезапускает сервлет старт

    }
}
//ѕосле победы по€витс€ кнопка УStart againФ. ѕосле клика по ней Ц поле полностью очиститс€, и игра начнетс€ сначала.
//основна€ логика написана в <script></script>   и body файла index2.jsp