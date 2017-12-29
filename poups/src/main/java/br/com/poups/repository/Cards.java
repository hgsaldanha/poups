package br.com.poups.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.poups.model.Card;

@Repository
public interface Cards extends JpaRepository<Card, Long> {

	public List<Card> findAllByOrderByNameAsc();

}
