package com.xworkz.siri.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.siri.dto.BeverageDTO;
import com.xworkz.siri.dto.ChatDTO;
import com.xworkz.siri.dto.EducationDTO;
import com.xworkz.siri.dto.FamilyDTO;
import com.xworkz.siri.dto.MobileDTO;

@Component
	@RequestMapping("/")
	public class SiriController {
		public SiriController() {
			System.out.println("Running SiriControlor ");
		}

		@GetMapping("/email")

		public String onEmail(Model model) {

			model.addAttribute("email", "Siri746@gmail.com");

			return "index.jsp";
		}

		@GetMapping("/mobile")

		public String onMobile(Model model) {

			model.addAttribute("mobile", "Realme");

			return "index.jsp";
		}

		@GetMapping("/aadar")

		public String onAadar(Model model) {

			model.addAttribute("aadar", "432084544901");

			return "index.jsp";
		}

		@GetMapping("/age")

		public String onAge(Model model) {

			model.addAttribute("age", "23");

			return "index.jsp";
		}

		@GetMapping("/date")

		public String onDate(Model model) {

			model.addAttribute("date", LocalDateTime.of(2000, 01, 21, 21, 06));

			return "index.jsp";
		}

		@GetMapping("/sal")

		public String onSalary(Model model) {

			model.addAttribute("sal", 200000);

			return "index.jsp";
		}

		@GetMapping("/best")

		public String onBestFriend(Model model) {

			List<String> list = Stream
					.of("sangeetha", "sahana", "priya", "bhoomi", "akash", "kiran", "navya", "chiru")
					.collect(Collectors.toList());
			model.addAttribute("lists", list);

			return "index.jsp";
		}

		@GetMapping("/place")

		public String onPlace(Model model) {

			List<String> place = Stream.of("belur", "bangolore", "Beluur", "Mysore", "Gadag", "Chamarajanagara",
					"hassan", "Mandya", "Bidadi", "mangalore").collect(Collectors.toList());
			model.addAttribute("place", place);

			return "index.jsp";
		}

		@GetMapping("/set")

		public String onSkillSet(Model model) {

			List<String> set = Stream
					.of("DataType", "Chitradurga", "Variable", "JDK", "JVM", "JRE", "Constructor", "Chaining", "Method",
							"This", "Super", "Inheritence", "Polymorphisam", "Overloading", "Overriding", "Encapsulation",
							"Abstraction", "Interface", "Abstract", "Collection", "ArrayList", "LinkedList", "Set", "Queqe",
							"HashSet", "Linked Hash Set", "TreeSet", "Map", "CirclurQueue", "SortedMap", "Treemap",
							"HashTable", "Linked Hash table", "Spring", "Jpa", "JSp", "Servelet")
					.collect(Collectors.toList());
			model.addAttribute("set", set);

			return "index.jsp";
		}

		@GetMapping("/education")

		public String onEcucation(Model model) {

			EducationDTO dto = new EducationDTO("BE", "Chamarajanagar", "Bedarapura", "Day College", 2022,
					"Chamarajanagara", "577542", "2022", "Computer Science And Engineering", "GEC chamarajanagar");
			model.addAttribute("dto", dto);

			return "index.jsp";
		}

		@GetMapping("/chat")

		public String onChat(Model model) {

			ChatDTO dto = new ChatDTO("siri", "shalini", 9876523159L, "punya", "online", "3days", "Wattsapp", false,
					"Airtel", false);
			model.addAttribute("chat", dto);

			return "index.jsp";
		}

		@GetMapping("/mobiles")

		public String onMobileDTO(Model model) {

			MobileDTO dto = new MobileDTO("sumsang", "Oppo", 2022, "Indian", "21-01-2022");
			model.addAttribute("mobile", dto);

			return "index.jsp";
		}

		@GetMapping("/beverage")

		public String onBeverage(Model model) {

			BeverageDTO dto = new BeverageDTO("Mango", "mango", "Nayana", "20124sdc", 99007, "kiru", "Karnataka");
			model.addAttribute("beverage", dto);

			return "index.jsp";
		}

		@GetMapping("/family")

		public String onFamily(Model model) {

			FamilyDTO dto = new FamilyDTO("shalini", "Dharmappa", "Jayalakshmi", "sharath", "Mulenahhali", "hassan",
					"Belur", "M D", "rangayya");
			model.addAttribute("family", dto);

			return "index.jsp";
		}

	}



