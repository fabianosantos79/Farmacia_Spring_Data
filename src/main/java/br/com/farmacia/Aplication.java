package br.com.farmacia;

//import br.com.farmacia.orm.Fabricante;
//import br.com.farmacia.orm.Produto;
//import br.com.farmacia.repository.FabricanteRepository;
//import br.com.farmacia.repository.ProdutoRepository;
import br.com.farmacia.service.ProdutoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplication implements CommandLineRunner {

//    private final ProdutoRepository produtoRepository;
//    private final FabricanteRepository fabricanteRepository;

//    public Aplication(ProdutoRepository produtoRepository, FabricanteRepository fabricanteRepository){
//        this.produtoRepository = produtoRepository;
//        this.fabricanteRepository = fabricanteRepository;
//    }

    private final ProdutoService produtoService;

    public Aplication(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Aplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Fabricante fabricante = new Fabricante();
//        fabricante.setNome("Bayer");
//
//        Produto produto = new Produto();
//        produto.setNome("Aspirina");
//        produto.setDescricao("Para dor de cabeça");
//        produto.setPreco(14.50);
//        produto.setFabricante(fabricante);
//
//        fabricanteRepository.save(fabricante);
//        produtoRepository.save(produto);


        produtoService.atualizarDescricao();

        produtoService.listarProdutos();

        produtoService.cadastrar();

        produtoService.deletar();

        produtoService.findIdNome();
    }
}
