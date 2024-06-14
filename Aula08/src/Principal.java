import java.util.Calendar;
import java.util.Date;

public class Principal {
    public static void main(String[] args) throws Exception {
        // Criar Cliente (comprou oque, vendedor, gerente que atendeu)

        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        System.out.printf("\n\n*** Gerente ***\n");
        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setCpf("04685778422");
        gerente.setUsuario(true);
        gerente.setDepartamento("Contabilidade");
        gerente.bonificacao(3000.00,10);
        gerente.realizarReauniao(false);

        System.out.printf("\n\n*** Vendedor ***\n");
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Joao");
        vendedor.setCpf("02458745632");
        vendedor.setMatricula("MT001");
        vendedor.setSetor("vendas");
        vendedor.bonificacao(1000.00,10);
        vendedor.venda(2, "ventilador", 70);
        
        System.out.printf("\n\n*** Secretario ***\n");
        Secretario secretario = new Secretario();
        secretario.setNome("Marcia");
        secretario.setCpf("21485123677");
        secretario.setRamal(5551);
        secretario.setTurno("vespertino");
        secretario.bonificacao(2000.00,10);
        secretario.marcarReuniao(data,gerente.getNome());
        
    }
}
