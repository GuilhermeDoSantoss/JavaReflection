## 📦 Java Reflection API

## ✨ Visão Geral
A API de Reflection do Java está disponível desde a versão 1.1, mas raramente é abordada com destaque nas discussões do dia a dia da linguagem. No entanto, ela oferece recursos poderosos e muitas vezes subestimados.

Uma maneira simples de entendê-la é pensar como uma "tomografia das classes Java" — com Reflection, conseguimos "enxergar por dentro" de qualquer classe, mesmo sem conhecê-la previamente.

## 🔍 O que é Reflection?
Reflection é uma API que permite analisar e manipular metadados de classes em tempo de execução. Isso inclui:

Obter nome da classe, atributos, métodos e construtores

Acessar anotações e modificadores (como private, static, etc.)

Invocar métodos dinamicamente

Instanciar objetos mesmo sem conhecer a classe em tempo de compilação

## 🧠 Para que serve?
A Reflection pode ser usada em:

Frameworks e bibliotecas (como Spring, Hibernate, JUnit, Jackson)

Sistemas de serialização/desserialização

Injeção de dependência (DI)

Criação de ferramentas genéricas como ORMs, loggers ou serializadores

Testes automatizados

Plugins e sistemas de extensibilidade

## ⚠️ Cuidados ao usar
Apesar de poderosa, a API de Reflection deve ser usada com cautela:

Impacta performance, pois envolve operações em tempo de execução

Pode quebrar encapsulamento, acessando membros privados

Aumenta a complexidade e dificulta a manutenção

## 🧪 Exemplo simples


import java.lang.reflect.Method;


public class ReflectionDemo {

     public static void main(String[] args) throws Exception {
     
        Class<?> clazz = Class.forName("java.util.ArrayList");
        
        System.out.println("Métodos da classe ArrayList:");
        
        for (Method method : clazz.getDeclaredMethods()) {
        
            System.out.println(method.getName());
        }
    }
}
Este código imprime todos os métodos da classe ArrayList, mesmo sem conhecê-los antecipadamente.

## 🧰 Recursos úteis
Documentação oficial

Exemplos de uso em frameworks

Artigos sobre boas práticas

## 📌 Conclusão
A API Reflection é um recurso avançado que dá ao desenvolvedor poder de introspecção e manipulação de classes. Quando usada corretamente, pode resolver problemas complexos de forma elegante. Porém, com grande poder, vem grande responsabilidade. 😉
