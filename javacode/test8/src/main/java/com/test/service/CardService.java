package com.test.service;
import java.util.List;
import com.test.model.Card;
public interface CardService {
	public void addCard(Card c);
	public List<Card> findByID(int id);
	public Card findByName(String name);
	public List<Card> getByupType(int id);
	public void updateCard(Card c);
	public void deleteCard(String name);
	public List<Card> findAll();
}
