package com.mungdori.napgame.domain.member;

import java.time.LocalDateTime;

public class Member {

    private Long id;

    private String nickname;

    private String loginId;

    private String passwordHash;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deactivatedAt;
}
