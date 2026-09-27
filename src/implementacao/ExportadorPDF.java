package implementacao;

// Implementação concreta do Bridge para o formato PDF.
public class ExportadorPDF implements Exportador {

    @Override
    public void exportar(String conteudo) {
        System.out.println("----------------------------------------------------");
        System.out.println("[ExportadorPDF] Renderizando documento em PDF...");
        System.out.println("[ExportadorPDF] Aplicando fonte, margens e cabeçalho padrão .pdf");
        System.out.println("[ExportadorPDF] Conteúdo exportado:");
        System.out.println("   >> " + conteudo);
        System.out.println("[ExportadorPDF] Arquivo relatorio.pdf gerado com sucesso!");
        System.out.println("----------------------------------------------------");
    }
}
