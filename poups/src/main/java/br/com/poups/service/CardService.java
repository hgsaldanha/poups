package br.com.poups.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.poups.model.Card;
import br.com.poups.model.Flag;
import br.com.poups.repository.Cards;
import br.com.poups.repository.Flags;

@Service
public class CardService {
	@Autowired
	Cards cards;
	
	@Autowired
	Flags flags;

	public List<Card> findAll() {
		return cards.findAllByOrderByNameAsc();
	}

	public List<Flag> allFlags() {
		return flags.findAllByOrderByNameAsc();
	}

	public void save(Card card) {
		cards.save(card);
	}
}
