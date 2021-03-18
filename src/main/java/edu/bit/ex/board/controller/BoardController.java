package edu.bit.ex.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.bit.ex.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {

	@Autowired
	BoardService boardService;

	@GetMapping("/")
	public String index(Model model) {

		log.debug("index()...");
		log.info("index()...");

		return "thymeleaf/index";
	}

	@GetMapping("/board/list")
	public String list(Model model) {

		log.debug("list()...");
		log.info("list()...");
		model.addAttribute("list", boardService.getList());
		return "list";
	}

}
