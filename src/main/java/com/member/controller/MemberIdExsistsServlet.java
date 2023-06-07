package com.member.controller;

import com.member.model.dto.MemberDTO;
import com.member.model.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@WebServlet("/member/code")
public class MemberIdExsistsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String memberId = request.getParameter("inputValue");

        // input 이 비었을 경우 아무런 출력도 하지 않음
        if(!Objects.equals(memberId, "")) {
            String output = "";

            Map<String, String> parameter = new HashMap<>();
            parameter.put("memberId", memberId);

            String result = new MemberService().memberIdExsists(parameter);

            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();

            if (result != null) {
                output = "<span style=\"color: blue;\">존재하는 회원입니다!</span>";
            } else {
                output = "<span style=\"color: red;\">존재하지 않는 회원입니다.</span>";
            }

            out.println(output);

            out.flush();
            out.close();
        }
    }

}