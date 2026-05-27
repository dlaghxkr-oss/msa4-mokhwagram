package com.msa4mokhwagram.domain.auth.services;

import com.msa4mokhwagram.domain.auth.requests.LoginReq;
import com.msa4mokhwagram.domain.user.entities.User;
import com.msa4mokhwagram.domain.user.mapper.UserMapper;
import com.msa4mokhwagram.global.errors.custom.NotRegisteredException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserMapper userMapper;

    public void login(LoginReq loginReq) {
        // 유저정보 획득
        User user = userMapper.findByEmail(loginReq.email());
        // 유저 가입여부 확인
        if(user == null) {
            throw new NotRegisteredException("아이디와 비밀번호를 확인해주세요.");
        }
        // 비밀번호 체크

        // 토큰 생성

        // 리프래시 토큰을 DB 저장

        // 리프래시 토큰을 Cookie에 저장

        // 리턴

    }
}
