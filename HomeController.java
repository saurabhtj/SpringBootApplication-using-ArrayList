package springbootweb1.springbootweb1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController
{
    List<Student> students = new ArrayList<>();

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student s)
    {
        students.add(s);

        return "redirect:/studentlist";
    }

    @GetMapping("/studentlist")
    public String showStudent(Model model)
    {
        model.addAttribute("data", students);

        return "list";
    }
}
