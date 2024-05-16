package avfinal.controller.banco;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
 
    private List<String> palavras = new ArrayList<>();
	private Random random = new Random();

    public BancoDePalavras() {
        carregarPalavras();
    }
	public String getPalavra() {
        if (palavras.isEmpty()) {
            return null;
        }
        int indiceAleatorio = random.nextInt(palavras.size());
        return palavras.get(indiceAleatorio);
    }

    private void carregarPalavras() {
		String filePath = "C:/Users/Rayanne/Documents/pooita/POO-Java/jogoembaralharpalavras/src/main/java/avfinal/controller/banco/test.txt";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] palavrasNaLinha = linha.split("\\s+"); 
                for (String palavra : palavrasNaLinha) {
                    palavras.add(palavra);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
