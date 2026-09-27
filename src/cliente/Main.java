package cliente;

import abstracao.Relatorio;
import abstracao.RelatorioVendas;
import abstracao.RelatorioRH;
import implementacao.Exportador;
import implementacao.ExportadorPDF;
import implementacao.ExportadorExcel;
import implementacao.ExportadorHTML;

// Classe cliente: instancia os Exportadores e injeta via construtor
// nos Relatórios. Todo "new" de Exportador acontece aqui, nunca dentro
// das classes de abstracao/.
public class Main {

    public static void main(String[] args) {

        System.out.println("======================================================");
        System.out.println(" TESTE 1: Relatório de Vendas exportado em PDF");
        System.out.println("======================================================");
        Exportador exportadorPDF = new ExportadorPDF();
        Relatorio relatorioVendas = new RelatorioVendas(exportadorPDF); // injeção via construtor
        relatorioVendas.gerar();

        System.out.println();
        System.out.println("======================================================");
        System.out.println(" TESTE 2: MESMO objeto RelatorioVendas, trocando");
        System.out.println(" dinamicamente o formato para Excel em tempo de execução");
        System.out.println("======================================================");
        Exportador exportadorExcel = new ExportadorExcel();
        relatorioVendas.setExportador(exportadorExcel); // troca dinâmica, sem recriar o relatório
        relatorioVendas.gerar();

        System.out.println();
        System.out.println("======================================================");
        System.out.println(" TESTE 3: Novo Relatório de RH exportado em HTML");
        System.out.println("======================================================");
        Exportador exportadorHTML = new ExportadorHTML();
        Relatorio relatorioRH = new RelatorioRH(exportadorHTML); // injeção via construtor
        relatorioRH.gerar();

        System.out.println();
        System.out.println("======================================================");
        System.out.println(" VALIDAÇÃO CONCLUÍDA: Abstrações (Relatorio) e");
        System.out.println(" Implementações (Exportador) variam independentemente.");
        System.out.println("======================================================");
    }
}
