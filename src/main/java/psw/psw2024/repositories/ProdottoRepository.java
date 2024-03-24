package psw.psw2024.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import psw.psw2024.model.Prodotto;

public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
}