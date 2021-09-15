package com.careerit.cbook.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ContactController {

		@Autowired
		private ContactService contactService;
	
		@GetMapping(value = {"/","/index"})
		public String index(Model model,String pageNumStr,String pageSize) {
			int pageNum=0;
			int psize=20;
			
			if(pageNumStr==null) {
				pageNum=0;
			}else {
				pageNum=Integer.parseInt(pageNumStr)-1;
			}
			if(pageSize!=null) {
				psize = Integer.parseInt(pageSize);
			}
			log.info("Page number :{} and page size :{}",pageNum,psize);
			Page<Contact> page = contactService.allContacts(PageRequest.of(pageNum,psize));
			model.addAttribute("psize", psize);
			model.addAttribute("page", page);
			return "index";
		}
		
		@PostMapping("/addcontact")
		public String addContact(Contact contact) {
			
			//Logic
			
			return "redirect:index";
		}
}
