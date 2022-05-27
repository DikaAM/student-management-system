package com.portofolio.studentmanagementsystem.repository;

import com.portofolio.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StundentRepository extends JpaRepository<Student, Long> {

}
