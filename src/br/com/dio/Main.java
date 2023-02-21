package br.com.dio;

import br.com.dio.model.Gato;

public class Main {
    public static void main(String[] args) {
        Gato grafield = new Gato("nome", "vermelho", 35);
        System.out.println(grafield);

        Livro livro = new Livro("Jajsoiudhauisd", 321321);


    }

    class Livro {
        private String nome;
        private int numPaginas;

        public Livro(String nome, int numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


        public int getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(int numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }

}