package psw.psw2024.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import psw.psw2024.model.Prodotto;

import java.util.List;

public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
    List<Prodotto> findByCategoria_IdOrderByNomeAsc(Long id, Pageable pageable);

    List<Prodotto> findProdottoByCategoria_IdOrderByNomeAsc(Long id);
}