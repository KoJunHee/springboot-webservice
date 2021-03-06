package com.jko.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//단순히 인터페이스를 생성후, JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성 됩니다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
