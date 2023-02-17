package org.perscholas.mycmsapp.dao;

import org.perscholas.mycmsapp.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentsRepoI extends JpaRepository<Students,Integer> {
    Optional<Students> findByName(String name);
}