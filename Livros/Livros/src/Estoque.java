public class Estoque {
    Livro [] livros;

    public Estoque() {
    this.livros = new Livro[100];
    }

    public void adicionarLivro(Livro livro){
        for(int i=0; i<livros.length;i++){
            if(livros[i] != null && livros[i].isbn.equals(livro.isbn)){
               livros[i].quant += livro.quant;
               return;
            }
        }
        for(int i=0; i<livros.length;i++){
            if(livros[i] == null){
                livros[i] = livro;
                return;
            }
        }
    }

    public void removerLivro(String isbn){
        for(int i=0; i<livros.length;i++){
            if(livros[i] != null && livros[i].isbn.equals(isbn)){
                livros[i] = null;
                return;
            }  
        }  
    }
   

    public Livro buscarLivro(String isbn){
        for(int i=0; i<livros.length;i++){
            if(livros[i] != null && livros[i].isbn.equals(isbn)){
                return livros[i];
            }
        }
        return null;
    }

    public void listarLivros(){
        for (Livro livro : livros){
            if(livro != null){
                System.out.println("Livro: " + livro.titulo + "/ Autor:" + livro.autor + "/ ISBN:" + livro.isbn + "/ Quantidade:" + livro.quant);
            }

        }
}

    public void atualizarQuantidades(String isbn, int quant){
        for (Livro livro : livros){
            if(livro != null && livro.isbn.equals(isbn)){
                livro.quant = quant;
                return;
            }
        }
    }
}
