package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CardDao;
import com.test.model.Card;
import com.test.service.CardService;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardDao CardDao;
	
	@Override
	public void addCard(Card u) {
		
		CardDao.addCard(u);
	}
	
	@Override
	public List<Card> findByID(int id) {
		
		return CardDao.findByID(id);
	}

	@Override
	public Card findByName(String name) {
		
		return CardDao.findByName(name);
	}

	@Override
	public void updateCard(Card u) {
		
		CardDao.updateCard(u);
	}

	@Override
	public void deleteCard(String name) {
		
		CardDao.deleteCard(name);
	}

	@Override
	public List<Card> findAll() {
		
		return CardDao.findAll();
	}

	@Override
	public List<Card> getByupType(int id) {
		// TODO Auto-generated method stub
		return  CardDao.getByupType(id);
	}

}
