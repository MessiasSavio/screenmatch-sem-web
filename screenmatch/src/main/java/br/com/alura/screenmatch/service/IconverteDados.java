package br.com.alura.screenmatch.service;

public interface IconverteDados {
    //o metodo abaixo não se sabe ao cert o que vai ser recebido <T> T
    //porem espera que a saida seja uma classe Class<T> classe
    <T> T obterDados(String json, Class<T> classe);
}
