package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(name="/authors")
    public String getAll(Model model) {
        //model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
