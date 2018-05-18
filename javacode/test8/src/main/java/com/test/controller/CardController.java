package com.test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.Card;
import com.test.service.CardService;

@Controller
public class CardController {
	
	@Autowired
	private CardService CardService;
	
	@RequestMapping(value = "getCard.do",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Card> getNewCard(){
		 List<Card> cardlist = CardService.findAll();
//		 System.out.println("\n\n"+cardlist.toString()+"\n\n");
		return cardlist;

	}
	@RequestMapping(value = "getCardbyId.do",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Card> getCardbyId(@RequestBody Card c){
		 List<Card> cardlist = CardService.findByID(c.getcId());
//		 System.out.println("\n\n"+cardlist.toString()+"\n\n");
		return cardlist;

	}
	@RequestMapping(value = "getByupType.do",method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody List<Card> getByupType(@RequestBody int c){
		 List<Card> cardlist = CardService.getByupType(c);
//		 System.out.println("\n\n"+cardlist.toString()+"\n\n");
		return cardlist;

	}
	
	
}
