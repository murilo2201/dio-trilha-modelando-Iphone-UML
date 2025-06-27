public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() { System.out.println("Tocando música..."); }
    @Override
    public void pausar() { System.out.println("Música pausada."); }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    @Override
    public void atender() { System.out.println("Atendendo ligação..."); }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
