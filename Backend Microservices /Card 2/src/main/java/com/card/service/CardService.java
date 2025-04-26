package com.card.service;

import org.springframework.http.ResponseEntity;

import com.card.Dto.CardDto;
import com.card.entity.Card;

public interface CardService {
    
    
    public ResponseEntity<String> addCardUser(CardDto cardDto);
    

	
	public ResponseEntity<String> validatePayment(CardDto cardDto);
   
}

