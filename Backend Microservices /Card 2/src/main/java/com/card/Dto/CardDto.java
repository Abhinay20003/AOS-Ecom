package com.card.Dto;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CardDto {
	
	private int id;
    private Long cardNumber;
    private Long cvv;

   
}


