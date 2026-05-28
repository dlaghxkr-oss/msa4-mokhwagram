package com.msa4mokhwagram.domain.user.services;

import com.msa4mokhwagram.domain.user.mapper.UserMapper;
import com.msa4mokhwagram.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final JwtProvider jwtProvider;

}
