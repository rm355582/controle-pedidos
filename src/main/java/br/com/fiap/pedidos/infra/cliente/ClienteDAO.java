package br.com.fiap.pedidos.infra.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.fiap.pedidos.dominio.cliente.ClienteVO;

@Repository
public class ClienteDAO {

     @Autowired
    private JdbcTemplate jdbcTemplate;

    public ClienteVO consultarCliente() {
        String sql = "SELECT cpf, nome FROM Cliente ";
        
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<ClienteVO>(ClienteVO.class));
    }

}
