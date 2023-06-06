package com.member.controller;

import com.member.model.dto.MemberDTO;
import com.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@WebServlet("/member/select")
public class SelectMemberById extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String memberId = request.getParameter("memberId");

        Map<String, String> parameter = new HashMap<>();

        parameter.put("memberId", memberId);

        MemberDTO result = new MemberService().selectMemberById(parameter);

        String path = "";
        if(result != null) {
            path = "/WEB-INF/views/member/showMemberInfo.jsp";
            request.setAttribute("selectedMember", result);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "직원 정보 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}