package implementacao;

// Implementação concreta do Bridge para o formato HTML.
public class ExportadorHTML implements Exportador {

    @Override
    public void exportar(String conteudo) {
        System.out.println("----------------------------------------------------");
        System.out.println("[ExportadorHTML] Gerando página .html...");
        System.out.println("[ExportadorHTML] Montando tags <html><body> e estilo CSS básico");
        System.out.println("[ExportadorHTML] Conteúdo exportado:");
        System.out.println("   >> <p>" + conteudo + "</p>");
        System.out.println("[ExportadorHTML] Arquivo relatorio.html gerado com sucesso!");
        System.out.println("----------------------------------------------------");
    }
}
