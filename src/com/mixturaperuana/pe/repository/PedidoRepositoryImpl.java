package com.mixturaperuana.pe.repository;


import com.mixturaperuana.pe.data.DataPedidos;
import com.mixturaperuana.pe.enums.EstadoPedido;
import com.mixturaperuana.pe.exception.PedidoNoEncontradoException;
import com.mixturaperuana.pe.model.Empleado;
import com.mixturaperuana.pe.model.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PedidoRepositoryImpl implements PedidoRepository {

    private final Map<String, Pedido> pedidos;

    public PedidoRepositoryImpl() {
        this.pedidos = DataPedidos.inicializar();
    }

    @Override
    public void save(Pedido pedido) {

    }

    @Override
    public Pedido findById(String idPedido) throws PedidoNoEncontradoException {
        return null;
    }

    @Override
    public List<Pedido> findAll() {
        return new ArrayList<>(pedidos.values());
    }

    @Override
    public List<Pedido> findByEstado(EstadoPedido estado) {
        return pedidos.values().stream().filter(p -> p.getEstado() == estado).collect(Collectors.toList());
    }

    @Override
    public List<Pedido> findByRegistradoPor(Empleado empleado) {
        return List.of();
    }
}
