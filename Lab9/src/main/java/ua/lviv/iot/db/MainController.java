//package ua.lviv.iot.db;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import ua.lviv.iot.armament.model.ApartmentType;
//import ua.lviv.iot.armament.model.Armament;
//import ua.lviv.iot.armament.model.Power;
//import ua.lviv.iot.armament.model.Use;
//import ua.lviv.iot.armament.model.User;
//import ua.lviv.iot.db.ArmamentRepository;
//
//@Controller
//@RequestMapping(path="/demo") 
//public class MainController {
//
//	@Autowired 
//	private ArmamentRepository armamentRepository;
//	
//	@GetMapping(path="/add")
//	public @ResponseBody String addNewUser (@RequestParam ApartmentType type,
//			@RequestParam  double price, @RequestParam Power power, @RequestParam Use use,
//			@RequestParam User user, @RequestParam int amount) {
//		Armament n = new Armament();
//		n.setUse(use);
//		n.setType(type);
//		n.setAmount(amount);
//		n.setPower(power);
//		n.setUser(user);
//		armamentRepository.save(n);
//		return "Saved";
//	}
//	
//	@GetMapping(path="/all")
//	public @ResponseBody Iterable<Armament> getAllArmaments() {
//		return armamentRepository.findAll();
//	}
//}
