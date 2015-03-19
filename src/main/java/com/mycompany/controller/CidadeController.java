package com.mycompany.controller;

import com.mycompany.component.CidadeService;
import com.mycompany.domain.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @RequestMapping("/uf")
    public Cidade getCidadeInformacoes(@RequestParam(value = "id", required = false,
            defaultValue = "0") long id) {
        List<Cidade> listaCidades = cidadeService.getAllCidades();

        Cidade cidade = new Cidade();

        for (Cidade listaCidade : listaCidades) {
            if (listaCidade.getCd_cidade() == id)
                cidade = listaCidade;
        }

        return cidade;
    }


}
