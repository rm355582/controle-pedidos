package br.com.fiap.pedidos.aplicacao.produto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping
    public void salvarProduto(){

    }


    @GetMapping("/{id}")
    public void consultarProduto(@PathVariable Integer id){

    }

}
