package psw.psw2024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import psw.psw2024.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}