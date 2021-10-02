package principal;

import endereco.Endereco;
import pessoa.Pessoa;

public class Principal {

    public static void main(String[] args) {
        //instanciando Endereço
        
        Endereco e1 = new Endereco("Expedicionário João Adami", "Fernandes", 000);
        Endereco e2 = new Endereco("Av Joaquim Moreira", "Coronel Cortes", 56);
        Endereco e3 = new Endereco("Avenida João de Camargo", "Centro", 510);
        Endereco e4 = new Endereco("Pereira Costa", "Retiro", 85);
        Endereco e5 = new Endereco("Rua Nova", "São Benedito", 1);
        
        //instanciando Pessoas
        Pessoa p1 = new Pessoa("Pedro Gabriel Garcia Ribeiro Balestra", 00000000001, 2);
        Pessoa p2 = new Pessoa("INATEL", 1921584785, 1);
        Pessoa p3 = new Pessoa("Gabriela costa", 1455963265, 2);

        //Adicionando endereços a uma pessoa
        p1.addEndereco(e1);
        p1.addEndereco(e2);

        p1.mostraInfo();

        //Adicionando endereço a uma pessoa
        p2.addEndereco(e3);


        p2.mostraInfo();

        //Adicionando endereço a uma pessoa
        p3.addEndereco(e4);
        p3.addEndereco(e5);

        p3.mostraInfo();




    }
}