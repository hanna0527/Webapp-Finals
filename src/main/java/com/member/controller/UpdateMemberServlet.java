package com.member.controller;

import com.member.model.dto.MemberDTO;
import com.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/member/update")
public class UpdateMemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int memberId = Integer.parseInt(request.getParameter("memberId"));
        String memberName = request.getParameter("memberName").trim();
        String birthDate = request.getParameter("birthDate").replace("-", "");
        String categoryCode = request.getParameter("categoryCode");
        String introduce = request.getParameter("introduce");
        String contact = request.getParameter("contact").replace("-", "");
        String startDate = request.getParameter("startDate").replace("-", "");
        String activeStatus = request.getParameter("activeStatus");

        MemberDTO member = new MemberDTO();
        member.setMemberCode(memberId);
        member.setMemberName(memberName);
        member.setBirthDate(birthDate);
        member.setCategoryCode(categoryCode);
        member.setIntroduce(introduce);
        member.setContact(contact);
        member.setStartDate(startDate);
        member.setActiveStatus(activeStatus);

        boolean result = new MemberService().modifyMember(member);
        String path = "";
        if(result) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "update");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("errorCode", "update");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}