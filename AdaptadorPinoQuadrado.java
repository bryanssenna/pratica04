public class AdaptadorPinoQuadrado implements PinoRedondo {
    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    @Override
    public double getRaio() {
        // Calculando o raio equivalente: L/√2, onde L é a largura do quadrado
        return pinoQuadrado.getLargura() / Math.sqrt(2);
    }
}
