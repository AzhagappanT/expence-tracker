package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abi.quizeapp.controller.Question;


@Repository
       public interface QuestionDao extends JpaRepository<Question, Integer> {
	
}

 