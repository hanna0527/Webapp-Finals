package com.member.model.dao;

import com.member.model.dto.MemberDTO;

import java.util.List;
import java.util.Map;

public interface MemberDAO {
    List<MemberDTO> selectAllMember();

    MemberDTO selectMemberById(Map<String, String> parameter);

    List<MemberDTO> selectMemberByCategory(Map<String, String> parameter);

    String selectNewMemberId();

    int registMember(MemberDTO member);

    int modifyMember(MemberDTO member);

    int deleteMember(Map<String, String> parameter);

    String memberIdExsists(Map<String, String> parameter);
}
