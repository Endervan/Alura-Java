package com.educandowebender.course_spring.repositores;

import com.educandowebender.course_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
