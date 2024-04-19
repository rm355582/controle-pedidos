package br.com.fiap.pedidos.aplicacao.cliente;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.pedidos.dominio.cliente.ClienteVO;
import br.com.fiap.pedidos.infra.cliente.ClienteDAO;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteDAO clienteDAO;

    @GetMapping
    public ClienteVO consultarCliente(){
        return clienteDAO.consultarCliente();
    }

}
