import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CardDto } from '../card.model';

@Injectable({
  providedIn: 'root'
})
export class CardService {

  private baseUrl = 'http://localhost:8089/card';
 
  constructor(private http: HttpClient) { }
 
  validateCardDetails(cardDto: CardDto) {
    return this.http.post(`${this.baseUrl}/cardDetails`, cardDto);
  }
}
