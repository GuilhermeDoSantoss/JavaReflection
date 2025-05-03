package com.guilherme.GeradorXML.main;

import com.guilherme.GeradorXML.model.Cliente;
import com.guilherme.GeradorXML.model.Endereco;
import com.guilherme.GeradorXML.processadorxml.XMLProcessor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeradorXmlApplication {

	public static void main(String[] args) {

        Cliente c = new Cliente();
        c.setId(12345);
        c.setNome("Guilherme dos Santos");
        c.setTelefone("912345678");
        c.setEmail("guilherme@santos.com");

        Endereco e = new Endereco();
        e.setTipo("Rua");
        e.setLogradouro("Rua 1 Lote 1 Quadra 4");
        e.setNumero(91);
        e.setCidade("Rio de Janeiro");
        e.setBairro("Cosmos");
        e.setComplemento("Ap 205 - Predio B");
        e.setUf("RJ");
        e.setCep("01234-567");

        c.setEndereco(e);

        // vou criar um determinado processador para converter de uma classe para XML
        try{
            System.out.println(XMLProcessor.generateXML(e));
        } catch(Exception ex){
            System.out.println("Não deu certo.");
            ex.printStackTrace();
        }


	}

}
