package implementacao;

// Contrato que todo formato de exportação precisa seguir.
// Novos formatos (CSV, JSON, etc.) entram aqui sem alterar os relatórios.
public interface Exportador {
    void exportar(String conteudo);
}
