package com.member.controller;

import com.member.model.dto.MemberDTO;
import com.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/list")
public class SelectAllMemberServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberService memberService = new MemberService();
        List<MemberDTO> memberList = memberService.selectAllMember();

        String path = "";
        if(memberList != null) {
            path = "/WEB-INF/views/member/memberList.jsp";
            request.setAttribute("memberList", memberList);
        } else {
            path = "/WEB-INF/common.errorPage.jsp";
            request.setAttribute("errorCode", "selectAll");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}