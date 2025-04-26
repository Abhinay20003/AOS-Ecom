package com.card.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.card.Dto.CardDto;
import com.card.entity.Card;
import com.card.repository.CardRepository;

@Service
public class CardServiceImpl implements CardService {
    
    @Autowired
    private CardRepository cardRepository;
    
    @Autowired
    private ModelMapper modelMapper;
    
    @Override
	public ResponseEntity<String> addCardUser(CardDto cardDto) {
			Card c1 = this.modelMapper.map(cardDto, Card.class);
			cardRepository.save(c1);
 
		return new ResponseEntity<>("{\"message\": \"Card Added\"}", HttpStatus.OK);	
		
		
	}
 
    @Override
    public ResponseEntity<String> validatePayment(CardDto cardDto) {
        Card c2 = cardRepository.findBycardNumber(cardDto.getCardNumber());
       // Card c3 = cardRepository.findBycvv(cardDto.getCvv());
        if (c2 != null) {
        	return new ResponseEntity<>("Card accepted", HttpStatus.OK);
        }
        return new ResponseEntity<>("Card denied", HttpStatus.BAD_REQUEST);
 
    }
    
}
