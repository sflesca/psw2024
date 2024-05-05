package psw.psw2024.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import psw.psw2024.model.Categoria;
import psw.psw2024.model.Prodotto;
import psw.psw2024.repositories.CategoriaRepository;
import psw.psw2024.repositories.ProdottoRepository;

@Service
public class UtilityService {
    CategoriaRepository catrep;
    ProdottoRepository prodrep;

    public UtilityService(CategoriaRepository catrep, ProdottoRepository prodrep) {
        this.catrep = catrep;
        this.prodrep = prodrep;
    }

    @Transactional(rollbackFor = Exception.class)
    public void populate(){
        Categoria c = new Categoria();
        c.setNome("Elettrodomesti");
        catrep.save(c);

        c = new Categoria();
        c.setNome("Computer");
        catrep.save(c);

        int id =0;
        for(Categoria cat : catrep.findAll()){
            for (int i=0;i<5;i++){
                Prodotto p = new Prodotto();
                p.setNome("prodotto"+id++);
                p.setCategoria(cat);
                prodrep.save(p);
            }
        }
    }
}
