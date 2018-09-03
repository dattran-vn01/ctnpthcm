package ctnpq;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @GetMapping("/info")
  public String info(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    model.addAttribute("name", name);
    return "admin/index";
  }

  @GetMapping("/profile")
  public String profile(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    model.addAttribute("name", name);
    return "admin/profile";
  }
}
