package com.ant.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.ant.vo.KakaoUserVO;
import com.ant.vo.UserVO;
 
@Mapper
public interface UserMapper {
 
    public List<KakaoUserVO> userList();
//    public KakaoUserVO fetchUserByID(int id);
    public KakaoUserVO kakaofetchUserByID(String id);
    public void updateUser(KakaoUserVO user);
    public void insertUser(KakaoUserVO user);
    public void kakaoinsertUser(KakaoUserVO kakaouser);
    public void deleteUser(int id);
    
}