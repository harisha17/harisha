package com.schooolmanagement.schoolmanagementsystem.repositorytest;

import com.schooolmanagement.schoolmanagementsystem.model.Address;
import com.schooolmanagement.schoolmanagementsystem.model.Student;
import com.schooolmanagement.schoolmanagementsystem.repository.StudentRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@SpringBootTest
public class RepositoryTest {

  @Autowired
     private StudentRepository studentRepository;

    @Test
    @Order(3)
     public void testGetStudentByName()
    {
        //given
        Student Harisha = Student.builder()
                .name("Ashok")
                .email("harisha@gmail.com")
                .study("9th")
                .address(null)
                .build();
        Address HarishaAddress = Address.builder().City("machilipatnam").State("Andhra Pradesh").pinCode(521001).build();
        Harisha.setAddress(HarishaAddress);
        Student savedStudent = studentRepository.save(Harisha);

        //when
        Student student = studentRepository.getStudentByName("Ashok");

        //then
        Assertions.assertThat(savedStudent.getId()).isNotNull();
        Assertions.assertThat(student.getName()).isEqualTo("Ashok");
    }

    @Test
   @Order(2)
    public void saveStudent() {
        //given
        Student student = Student.builder()
                .name("Hanumanthu")
                .email("harisha123@gnail.com")
                .study("9th")
                .address(null)
                .build();
        //when
        studentRepository.save(student);

        // then
        Assertions.assertThat(student.getId()).isGreaterThan(0);
    }

    @Test
    @Order(4)
    public void deleteStudent(){
        //given
        Student student = Student.builder()
                .name("Harisha")
                .email("harisha123@gnail.com")
                .study("9th")
                .address(null)
                .build();
        //when
        studentRepository.delete(student);
        //then
        Assertions.assertThat(student.getId()).isEqualTo(0);
    }

    @Test
    public void getStudentTest() {
        //given
        //when
        Student student = studentRepository.findById(1).get();
        //then
        Assertions.assertThat(student.getId()).isEqualTo(1);
    }




}
