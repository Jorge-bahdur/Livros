public class App {
    public static void main(String[] args) throws Exception {
     Estoque estoque = new Estoque();

     Livro livro1 = new Livro("Livro 1", "Autor 1", "12345", 10);
     Livro livro2 = new Livro("Livro 2", "Autor 2", "67890", 5);

     estoque.adicionarLivro(livro1);
     estoque.adicionarLivro(livro2);

     estoque.listarLivros();

     Livro encontrado = estoque.buscarLivro("12345");
     if(encontrado != null){
        System.out.println("Livro encontrado: " + encontrado.titulo);
     }
          
     
     estoque.removerLivro("12345");
     estoque.listarLivros();
     estoque.atualizarQuantidades("67890",3);
     estoque.listarLivros();

    
    }

}
