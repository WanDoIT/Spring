package com.simple.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.board.mapper.BoardMapper;
import com.simple.command.BoardVO;
import com.simple.command.ScoreVO;

@Service("보드")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void boardRegist(BoardVO vo) {
		boardMapper.boardRegist(vo);
		
	}

	@Override
	public ArrayList<BoardVO> getList() {

		return boardMapper.getList();
	}

	@Override
	public void boardDelete(int num) {
		
		boardMapper.boardDelete(num);
		
	}

}
