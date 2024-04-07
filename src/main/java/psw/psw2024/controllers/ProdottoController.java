package psw.psw2024.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import psw.psw2024.model.Prodotto;
import psw.psw2024.repositories.ProdottoRepository;

import java.util.List;

@Controller
@RequestMapping("/prodotti")
public class ProdottoController {
    ProdottoRepository rep;

    public ProdottoController(ProdottoRepository rep) {
        this.rep = rep;
    }

    @GetMapping("/all")
    public String getProdotti(Model model){
        model.addAttribute("prodotti", rep.findAll());
        return "list_prodotti";
    }

    @GetMapping("/bycat/{catid}")
    public String getProdottiByCat(@PathVariable Long catid, Model model){
        List<Prodotto> prodotti = rep.findProdottoByCategoria_IdOrderByNomeAsc(catid);
        model.addAttribute("prodotti", prodotti);
        return "list_prodotti";
    }
}
