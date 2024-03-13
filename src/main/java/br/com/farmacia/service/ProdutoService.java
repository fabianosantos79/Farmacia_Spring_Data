package br.com.farmacia.service;

import br.com.farmacia.orm.Produto;
import br.com.farmacia.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public void atualizarDescricao(){
        Produto produto = new Produto();
        produto.setId(1);
        produto.setDescricao("Para todas as dores");
        produto.setNome("Aspirina");
        produto.setPreco(14.50);
        produtoRepository.save(produto);
    }

    public void listarProdutos(){
        Iterable<Produto> produtos = produtoRepository.findAll();
        produtos.forEach(produto -> System.out.println(produto));
    }
}
