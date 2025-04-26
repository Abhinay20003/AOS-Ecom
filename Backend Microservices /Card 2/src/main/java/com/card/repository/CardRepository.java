package com.card.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card.Dto.CardDto;
import com.card.entity.Card;



@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

	
	Card findBycardNumber(Long cardNumber);
	//Card findBycvv(Long cvv);
	
	
	
}
