package com.member.controller;

import com.member.model.dto.MemberDTO;
import com.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@WebServlet("/member/insert")
public class InsertMemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        String today = sdf.format(calendar.getTime());

        String memberName = request.getParameter("memberName").trim();
        String birthDate = request.getParameter("birthDate").replace("-", "");
        String categoryCode = request.getParameter("categoryCode");
        String introduce = request.getParameter("introduce");
        String contact = request.getParameter("contact").replace("-", "");

        MemberService memberService = new MemberService();
        String newMemberId = memberService.selectNewMemberId();

        MemberDTO member = new MemberDTO();
        if(newMemberId != null) {
            member.setMemberCode(Integer.parseInt(newMemberId));
        }
        member.setMemberName(memberName);
        member.setBirthDate(birthDate);
        member.setCategoryCode(categoryCode);
        member.setIntroduce(introduce);
        member.setContact(contact);
        member.setStartDate(today);
        member.setActiveStatus("Y");

        boolean result = memberService.registNewMember(member);

        String path ="";
        if(result) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "insert");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("errorCode", "insert");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}