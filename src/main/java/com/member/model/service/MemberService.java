package com.member.model.service;

import com.member.model.dao.MemberDAO;
import com.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.template.Template.getSqlSession;

public class MemberService {

    private MemberDAO memberDAO;

    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);
        List<MemberDTO> allMemberList = memberDAO.selectAllMember();

        sqlSession.close();

        return allMemberList;
    }

    public MemberDTO selectMemberById(Map<String, String> parameter) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        MemberDTO result = memberDAO.selectMemberById(parameter);

        if(result != null) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public String selectNewMemberId() {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        String newId = memberDAO.selectNewMemberId();

        sqlSession.close();

        return newId;
    }

    public boolean registNewMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.registMember(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.commit();

        return result > 0 ? true : false;
    }

    public boolean modifyMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.modifyMember(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteMember(Map<String, String> parameter) {

        SqlSession sqlSession = getSqlSession();
        memberDAO = sqlSession.getMapper(MemberDAO.class);

        int result = memberDAO.deleteMember(parameter);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
