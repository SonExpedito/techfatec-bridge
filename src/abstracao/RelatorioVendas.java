package abstracao;

import implementacao.Exportador;

// Relatório já existente no sistema, agora desacoplado do formato de saída.
public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar() {
        String conteudo = "Relatório de Vendas | Período: Set/2026 | "
                + "Total Faturado: R$ 125.430,00 | Vendas Realizadas: 342";
        System.out.println("[RelatorioVendas] Processando dados de vendas...");
        exportar(conteudo);
    }
}
