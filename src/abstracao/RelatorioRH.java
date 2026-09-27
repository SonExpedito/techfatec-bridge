package abstracao;

import implementacao.Exportador;

// Novo relatório pedido pelo negócio. Foi criado sem mexer em nenhuma
// outra classe já existente (Exportador ou RelatorioVendas).
public class RelatorioRH extends Relatorio {

    public RelatorioRH(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar() {
        String conteudo = "Relatório de Desempenho de RH | Período: Set/2026 | "
                + "Colaboradores Avaliados: 58 | Média de Desempenho: 8.7/10";
        System.out.println("[RelatorioRH] Processando avaliações de desempenho...");
        exportar(conteudo);
    }
}
