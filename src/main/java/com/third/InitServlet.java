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
    // �������� ����� ������
    HttpSession curenSesion;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        curenSesion = request.getSession(true);
        Questions questions = new Questions();
        curenSesion.setAttribute("quest",questions);// ������� � ������� ��c��� treeMap �� ����������
        // ��������� � ���������� �������
        //�������������� �������   �� �������� index.jsp ����� ������
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
