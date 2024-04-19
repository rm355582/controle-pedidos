package br.com.fiap.pedidos.aplicacao.pedido;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @PostMapping
    public void enviarPedido(){

    }

}
