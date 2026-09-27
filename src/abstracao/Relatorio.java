package abstracao;

import implementacao.Exportador;

/**
 * Classe abstrata do Bridge. Guarda uma referência a Exportador
 * (não herda dele) — é essa referência que forma a ponte entre
 * relatórios e formatos de exportação.
 *
 * Nunca cria um Exportador com "new" aqui dentro: ele sempre vem
 * pronto de fora, via construtor.
 */
public abstract class Relatorio {

    protected Exportador exportador;

    // Injeção de dependência via construtor.
    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
    }

    // Troca o formato de exportação sem precisar recriar o relatório.
    public void setExportador(Exportador exportador) {
        this.exportador = exportador;
    }

    // Cada relatório concreto monta seu próprio conteúdo aqui.
    public abstract void gerar();

    // Encaminha o conteúdo para o Exportador injetado.
    protected void exportar(String conteudo) {
        this.exportador.exportar(conteudo);
    }
}
