package com.example.produto.core.usecase;


import com.example.produto.core.domain.Produto;

import java.util.List;

public interface GerenciarProdutoUseCasePort {
    Produto salvar(Produto produto);
    List<Produto> buscarProdutoPorCategoria(String categoria);
    Produto buscarProdutoPorId(Long produtoId);
    void deletarProduto(Long idProduto);
    Produto alterarProduto(Produto produto, Long idProduto);
}
