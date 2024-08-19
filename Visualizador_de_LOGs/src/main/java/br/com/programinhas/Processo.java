package br.com.programinhas;

public class Processo {

    /**
     * Converte um vetor de String para um vetor de double.
     * 
     * @param vetor O vetor de String a ser convertido.
     * @return O vetor convertido para double.
     */
    public static double[] converterParaDouble(String[] vetor) {
        double[] resultado = new double[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = Double.parseDouble(vetor[i]);
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        String[] vetor = {"1.1", "2.2", "3.3"};
        double[] resultado = converterParaDouble(vetor);

        // Imprime o resultado
        for (double num : resultado) {
            System.out.println(num);
        }
    }
}


