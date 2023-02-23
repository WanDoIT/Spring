package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String QuizView() {
		
		return "quiz/quiz01";
	}

	@RequestMapping("/sendBirth")
	public String sendBirth(@ModelAttribute("birth") Quiz01VO vo) {
		System.out.println(vo.toString());
		return "quiz/quiz01_ok";
	}
	
	
	@RequestMapping("/quiz02")
	public String Quiz02() {
		
		return "quiz/quiz02";
	}
	
	@RequestMapping("/quiz02_ok")
	public String Quiz02ok() {
		
		return "quiz/quiz02_ok";
	}
	
//	@RequestMapping(value ="/join", method =RequestMethod.POST )
//	public String join(@RequestParam("id") String id,
//			@RequestParam("pw") String pw,
//			@RequestParam("name") String name,
//			@RequestParam("email") String email,
//			RedirectAttributes ra) {
//		ra.addAttribute("id",id);
//		ra.addAttribute("pw",pw);
//		ra.addAttribute("name",name);
//		ra.addAttribute("email",email);
//	
//		System.out.println(ra.toString());
//		return "redirect:/quiz/quiz02_ok";
//	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("id") String id,
			@ModelAttribute("pw") String pw,
			@ModelAttribute("name") String name,
			@ModelAttribute("email") String email) {
		
		return "quiz/quiz02_ok";
	}
	
	
	
	@RequestMapping("/quiz03")
	public String Quiz03() {
		
		return "quiz/quiz03";
	}
	@RequestMapping("/quiz03_ok")
	public String Quiz03ok() {
		
		return "quiz/quiz03_ok";
	}
	
	@RequestMapping(value ="/join2", method =RequestMethod.POST )
	public String join(@RequestParam("id") String id,
			@RequestParam("pw") String pw,
			@RequestParam("pw_check") String pwc,
			RedirectAttributes ra,
			Model model) {
		if(id.equals("")) {
			
			ra.addFlashAttribute("msg","아이디확인하세요");
			return "redirect:/quiz/quiz03";
		} else if(!pw.equals(pwc)) {
			
			ra.addFlashAttribute("msg","비번확인하세요");
			return "redirect:/quiz/quiz03";
		}
		
		model.addAttribute("id",id);

		return "quiz/quiz03_ok";
	}
}
