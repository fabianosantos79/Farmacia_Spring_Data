package br.com.farmacia.service;

import br.com.farmacia.orm.Produto;
import br.com.farmacia.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public void cadastrar(){
        Produto produto2 = new Produto();
        produto2.setDescricao("Contra Azia");
        produto2.setNome("Sal de Frutas");
        produto2.setPreco(2.35);
        produtoRepository.save(produto2);

        Produto produto3 = new Produto();
        produto3.setDescricao("Para dores musculares");
        produto3.setNome("Gelol");
        produto3.setPreco(104.97);
        produtoRepository.save(produto3);
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

    public void deletar(){
        produtoRepository.deleteById(3);
        System.out.println("Deletado");
    }

    public void findIdNome(){
        List<Produto> list = produtoRepository.findIdNome(2, "Sal de Frutas");
        list.forEach(System.out::println);
    }
}
