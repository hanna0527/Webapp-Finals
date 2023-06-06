package com.member.controller;

import com.member.model.service.MemberService;
import org.apache.ibatis.annotations.ResultMap;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/member/delete")
public class DeleteMemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String memberId = request.getParameter("memberId");

        Map<String, String> parameter = new HashMap<>();

        parameter.put("memberId", memberId);

        boolean result = new MemberService().deleteMember(parameter);

        String path ="";
        if(result) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "delete");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("errorCode", "delete");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}