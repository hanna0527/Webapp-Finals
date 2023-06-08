package com.member.controller;

import com.member.model.dto.MemberDTO;
import com.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/member/selectByCategory")
public class SelectMemberByCategoryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String categoryCode = request.getParameter("categoryCode");

        MemberService memberService = new MemberService();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("categoryCode", categoryCode);

        List<MemberDTO> memberList = memberService.selectMemberByCategory(parameter);

        String path = "";
        if(memberList != null && memberList.size() > 0) {
            path = "/WEB-INF/views/member/CategoryMemberList.jsp";
            request.setAttribute("memberList", memberList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("errorCode", "selectAll");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
    }
