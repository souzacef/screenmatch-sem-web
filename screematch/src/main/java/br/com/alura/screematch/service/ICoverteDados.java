package br.com.alura.screematch.service;

public interface ICoverteDados {
    <T> T obterDados(String json, Class<T> classe);

}
