package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.board.service.BoardServiceImpl;
import com.simple.command.BoardVO;


@Controller
@RequestMapping("/service")
public class BoardController {
	
	@Autowired
	@Qualifier("보드")
	BoardServiceImpl board;
	
	@RequestMapping("/boardRegister")
	public String regist() {
		
		return "service/boardRegister";
	}
	
	//폼요청
		@RequestMapping(value = "/boardRegist", method = RequestMethod.POST)
		public String boardRegister(BoardVO vo) {
			
			board.boardRegist(vo); 
			
			return "service/boardResult";
		}
	
	@RequestMapping("/boardList")
	public String result(Model model) {
		ArrayList<BoardVO> list = board.getList();
		System.out.println(list.toString());
		model.addAttribute("list",list);
		return "service/boardList";
	}
	
	

	//삭제요청
	@RequestMapping("/boardDelete")
	public String delete(@RequestParam("num") int num) {
			System.out.println(num);
			board.boardDelete(num);
		return "redirect:/service/boardList";
			
		}
	
	
	
}
