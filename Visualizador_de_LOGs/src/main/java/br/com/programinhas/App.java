package br.com.programinhas;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Chama o método lerArquivo da classe Arquivo e armazena o resultado em uma variável
        String conteudoArquivo = Arquivo.lerArquivo();

        // Separa as colunas em vetores
        separarColunas(conteudoArquivo);

        // Exibe o conteúdo do arquivo em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, conteudoArquivo);

        for (int i = 0; i < linhas.length; i++) {
            System.out.println("Linha: " + linhas[i] + ", Tempo: " + tempo[i] + ", Distância: " + distancia[i]);
        }

double LINHAS[] = Processo.converterParaDouble(linhas);
double TEMPO[] = Processo.converterParaDouble(tempo);
double DISTANCIA[] = Processo.converterParaDouble(tempo);






        LineChart lineChart = new LineChart(LINHAS, TEMPO, DISTANCIA);
        lineChart.setVisible(true);
    }

    // Declaração dos vetores
    static String[] linhas;
    static String[] tempo;
    static String[] distancia;

    

    // Método para separar as colunas em vetores
    public static void separarColunas(String conteudo) {
        // Divide o conteúdo em linhas, ignorando a última linha que está vazia
        String[] todasLinhas = conteudo.split("\n");

        // Inicializa os vetores com o número de linhas de dados
        int tamanho = todasLinhas.length - 1; // Subtrai 1 para ignorar a linha do cabeçalho
        linhas = new String[tamanho];
        tempo = new String[tamanho];
        distancia = new String[tamanho];

    

        // Preenche os vetores com os valores de cada linha
        for (int i = 1; i < todasLinhas.length; i++) { // Começa de 1 para pular a linha de cabeçalho

            String[] valores = todasLinhas[i].split(";");
            linhas[i - 1] = valores[0];
            tempo[i - 1] = valores[1];
            distancia[i - 1] = valores[2];
        }

        // Exemplo de como usar os vetores
//for (int i = 0; i < linhas.length; i++) {
    //System.out.println("Linha: " + linhas[i] + ", Tempo: " + tempo[i] + ", Distância: " + distancia[i]);
//}

        
    }

















}
