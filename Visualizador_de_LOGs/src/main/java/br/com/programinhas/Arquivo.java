package br.com.programinhas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class Arquivo {

    // Método que retorna o conteúdo do arquivo como uma String
    public static String lerArquivo() {
        Path caminho = Paths.get("C:/LOGS/LOG.txt");
        try {
            // Lê o conteúdo do arquivo como uma única string
            byte[] texto = Files.readAllBytes(caminho);
            return new String(texto, StandardCharsets.UTF_8);
        } catch (IOException erro) {
            erro.printStackTrace();
            return "Erro ao ler o arquivo.";
        }
    }
}
