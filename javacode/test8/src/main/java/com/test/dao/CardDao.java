package com.test.dao;

import java.util.List;

import com.test.model.Card;

public interface CardDao {
	
	public void addCard(Card u);
	
	public List<Card> findByID(int id);
	
	public List<Card> getByupType(int id);
	
	public Card findByName(String name);
	
	public void updateCard(Card u);
	
	public void deleteCard(String name);
	
	public List<Card> findAll();
	
}
