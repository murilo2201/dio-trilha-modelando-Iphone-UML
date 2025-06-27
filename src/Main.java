public class Main {

    public static void main(String[] args) {
        var iphone = new Iphone();

        // Testando Reprodutor Musical
        iphone.selecionarMusica("Imagine");
        iphone.tocar();
        iphone.pausar();

        // Testando Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando Navegador
        iphone.exibirPagina("https://dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}