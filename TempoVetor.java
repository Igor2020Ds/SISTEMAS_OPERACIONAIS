public class TempoVetor {

    public static void main(String[] args) {
        int tamanho1 = 1000;
        int tamanho2 = 10000;
        int tamanho3 = 100000;

        int[] vetor1 = new int[tamanho1];
        int[] vetor2 = new int[tamanho2];
        int[] vetor3 = new int[tamanho3];
        preencherVetor(vetor1);
        preencherVetor(vetor2);
        preencherVetor(vetor3);

        // tempo de percorrer o vetor
        long tempo1 = tempoPercorrerVetor(vetor1);
        long tempo2 = tempoPercorrerVetor(vetor2);
        long tempo3 = tempoPercorrerVetor(vetor3);

        System.out.println("Tempo para percorrer vetor de tamanho " + tamanho1 + ": " + tempo1 + " nanossegundos");
        System.out.println("Tempo para percorrer vetor de tamanho " + tamanho2 + ": " + tempo2 + " nanossegundos");
        System.out.println("Tempo para percorrer vetor de tamanho " + tamanho3 + ": " + tempo3 + " nanossegundos");
    }

    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }

    public static long tempoPercorrerVetor(int[] vetor) {
        long totalTime = 0;
        int iterations = 100000; 

        for (int j = 0; j < iterations; j++) {
            long startTime = System.nanoTime();

            for (int i = 0; i < vetor.length; i++) {
                int elemento = vetor[i];
            }

            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }

        return totalTime / iterations; 
    }
}
