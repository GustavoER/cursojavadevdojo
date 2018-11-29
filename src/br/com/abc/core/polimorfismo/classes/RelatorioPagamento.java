package br.com.abc.core.polimorfismo.classes;

public class RelatorioPagamento {
    public void relatorioPagamentoGerente(Gerente gerente) {
        System.out.println("Gerando relatório de pagamento para gerencia ");
        gerente.calcularPagamento();
        System.out.println("Nome " + gerente.getNome());
        System.out.println("Salario " + gerente.getSalario());

    }

    public void relatorioPagamentoVendedor(Vendedor vendedor) {
        System.out.println("Gerando relatório de pagamento para vendedor");
        vendedor.calcularPagamento();
        System.out.println("Nome " + vendedor.getNome());
        System.out.println("Salário " + vendedor.getSalario());

    }

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome " + funcionario.getNome());
        System.out.println("Salário " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println(g.getPnl());
        }
        if (funcionario instanceof Vendedor) {
            System.out.println("Salário " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
