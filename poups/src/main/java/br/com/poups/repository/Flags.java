package br.com.poups.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.poups.model.Flag;

public interface Flags extends JpaRepository<Flag,Integer> {

	public List<Flag> findAllByOrderByNameAsc();
	
}
