package com.sparta.service;

import com.sparta.User.User;
import com.sparta.User.UserRepository;
import com.sparta.User.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private  final UserRepository userRepository;

    @Transactional
    public Long update(Long id, UserRequestDto requestDto) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 없습니다.")
        );
        user.update(requestDto);
        return user.getId();
    }

}
