package psw.psw2024.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import psw.psw2024.repositories.CategoriaRepository;

@Controller
@RequestMapping("/categorie")
public class CategoriaController {

    private CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/viewCategorie")
    public String viewBooks(Model model) {
        model.addAttribute("categorie", categoriaRepository.findAll());
        return "view-categorie";
    }
}