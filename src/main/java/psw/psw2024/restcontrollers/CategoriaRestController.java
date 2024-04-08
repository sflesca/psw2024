package psw.psw2024.restcontrollers;

import org.springframework.web.bind.annotation.*;
import psw.psw2024.model.Categoria;
import psw.psw2024.repositories.CategoriaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaRestController {

    private CategoriaRepository categoriaRepository;

    public CategoriaRestController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/all")
    public List<Categoria> getAllCategories() {
        return categoriaRepository.findAll();
    }

    @PostMapping("/add")
    public Categoria addCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @PutMapping
    public Categoria updateCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping
    public void deleteCategoria(@RequestBody Categoria categoria) {
        categoriaRepository.delete(categoria);
    }
}
