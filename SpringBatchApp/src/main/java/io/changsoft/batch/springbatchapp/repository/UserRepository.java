package io.changsoft.batch.springbatchapp.repository;

import io.changsoft.batch.springbatchapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
