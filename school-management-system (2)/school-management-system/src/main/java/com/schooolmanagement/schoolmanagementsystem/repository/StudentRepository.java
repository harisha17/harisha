package com.schooolmanagement.schoolmanagementsystem.repository;



import com.schooolmanagement.schoolmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {

   Student getStudentByName(String name);

   @Query(value="SELECT * FROM Student_Details WHERE name = :name",nativeQuery=true)
   List<Student> getByName(@Param("name")String name);
   @Query(value="SELECT * FROM Student_Details WHERE age = :age",nativeQuery=true)
   List<Student> getByAge(@Param("age")int age);

}
