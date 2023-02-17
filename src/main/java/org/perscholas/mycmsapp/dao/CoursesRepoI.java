package org.perscholas.mycmsapp.dao;

import org.perscholas.mycmsapp.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepoI extends JpaRepository<Course,Integer> {
}