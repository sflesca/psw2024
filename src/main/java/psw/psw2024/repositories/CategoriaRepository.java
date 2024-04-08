package psw.psw2024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import psw.psw2024.model.Categoria;

import java.util.List;

@Transactional(readOnly = true)
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    @Query("select c from Categoria c where c.nome like ?1")
    List<Categoria> findByNomeLike(String nome);
}