package avfinal.controller;

import avfinal.service.Mecanica;

public class NDificil extends Mecanica {

    @Override
    public String iniciaJogo(String dificuldade) {
        super.iniciaJogo(dificuldade);
        numPalavras = 15;
        pontos = 0;
        numTentativas = 1; 
        return palavraEmbaralhada;
    }

    @Override
    public String getResposta() {
        return palavraOriginal;
    }

    @Override
    public int setNumTentativas() {
        return 1;
    }
}
