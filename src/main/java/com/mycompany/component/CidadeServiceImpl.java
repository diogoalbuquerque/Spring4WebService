package com.mycompany.component;


import com.mycompany.domain.Cidade;
import com.mycompany.persistence.CidadeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CidadeServiceImpl implements CidadeService {


    @Autowired
    private CidadeMapper cidadeMapper;

    @Override
    public List<Cidade> getAllCidades() {
        return cidadeMapper.getAllCidades();
    }
}
