package avfinal.controller;

import avfinal.service.Mecanica;

public class NFacil extends Mecanica {

    @Override
    public String iniciaJogo(String dificuldade) {
        super.iniciaJogo(dificuldade);
        numPalavras = 3;
        pontos = 0;
        numTentativas = 3; // Definindo o número de tentativas como 3
        return palavraEmbaralhada;
    }

    @Override
    public String getResposta() {
        return palavraOriginal;
    }

    @Override
    public int setNumTentativas() {
        return 3;
    }
}