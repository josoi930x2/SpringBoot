package net.datasa.homework240621.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.datasa.homework240621.model.board;
import net.datasa.homework240621.repository.boardRepository;

@Service
public class boardService {
	@Autowired
	boardRepository bRepository;
	
	public board createBoard(board b) {
		board saveBoard = bRepository.save(b);
		return saveBoard;
	}
	
	public List<board> selectAll() {
		List<board> selectBoard = bRepository.findAll();
		return selectBoard;
	}

}
