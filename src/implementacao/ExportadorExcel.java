package implementacao;

// Implementação concreta do Bridge para o formato Excel (XLSX).
public class ExportadorExcel implements Exportador {

    @Override
    public void exportar(String conteudo) {
        System.out.println("----------------------------------------------------");
        System.out.println("[ExportadorExcel] Criando planilha .xlsx...");
        System.out.println("[ExportadorExcel] Montando células, colunas e formatação numérica");
        System.out.println("[ExportadorExcel] Conteúdo exportado:");
        System.out.println("   >> " + conteudo);
        System.out.println("[ExportadorExcel] Arquivo relatorio.xlsx gerado com sucesso!");
        System.out.println("----------------------------------------------------");
    }
}
