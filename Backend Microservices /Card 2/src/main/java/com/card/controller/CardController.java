package com.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.card.Dto.CardDto;
import com.card.entity.Card;
import com.card.service.CardService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/card")
public class CardController {
	
	
	private CardService cardService;
	
		@Autowired
		public CardController(CardService cardService) {
			this.cardService = cardService;
		}
	 
		@PostMapping("/card")
		public ResponseEntity<String> Addcard(@RequestBody CardDto cardDto) {
			return cardService.addCardUser(cardDto);
		}
	 
		
		
		@PostMapping("/cardDetails")
		public ResponseEntity<String> validatecarddetails(@RequestBody CardDto cardDto) {
			return cardService.validatePayment(cardDto);
	 
		}

	
   

}

