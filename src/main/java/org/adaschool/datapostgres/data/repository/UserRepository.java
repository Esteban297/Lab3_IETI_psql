package org.adaschool.datapostgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.adaschool.datapostgres.data.entity.User;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
}

