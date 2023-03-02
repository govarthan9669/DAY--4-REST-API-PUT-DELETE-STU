// api repositoy
package com.example.DAY4_PUT_POST.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DAY4_PUT_POST.model.Student;







public interface repo extends JpaRepository<Student,Integer> {

	}