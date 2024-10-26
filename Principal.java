public class Principal {
    public static void main(String[] args) {
        // Criando um buraco redondo com um raio de 5.0
        BuracoRedondo buraco = new BuracoRedondo(5.0);

        // Criando um pino redondo com raio de 4.0
        PinoRedondo pinoRedondo = new PinoRedondoConcreto(4.0);
        System.out.println("Pino redondo encaixa? " + buraco.encaixa(pinoRedondo));

        // Criando um pino quadrado com largura de 5.0
        PinoQuadrado pinoQuadrado = new PinoQuadrado(5.0);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado encaixa? " + buraco.encaixa(adaptador));

        // Criando um pino quadrado com largura de 6.0
        PinoQuadrado pinoQuadradoGrande = new PinoQuadrado(6.0);
        AdaptadorPinoQuadrado adaptadorGrande = new AdaptadorPinoQuadrado(pinoQuadradoGrande);
        System.out.println("Pino quadrado grande encaixa? " + buraco.encaixa(adaptadorGrande));
    }
}
