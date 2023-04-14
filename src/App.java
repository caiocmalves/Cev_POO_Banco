import classes.ContaBanco;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco c1 = new ContaBanco();
        System.out.println(c1.getStatus());
        c1.abrirConta(01, "CC", "Caio Carvalho");
        System.out.println(c1.getStatus());
        c1.pagarMensal();
        System.out.println(c1.getSaldo());
        c1.depositar(150);
        System.out.println(c1.getSaldo());
        c1.sacar(88);
        System.out.println(c1.getSaldo());

        ContaBanco c2 = new ContaBanco();
        c2.abrirConta(02, "CP", "DIOINZADA");
        System.out.println(c2.getSaldo());
        c2.pagarMensal();
        System.out.println(c2.getSaldo());
        


        //c1.fecharConta();
        System.out.println(c1.getSaldo());
        c1.sacar(c1.getSaldo());
        System.out.println(c1.getSaldo());
        c1.fecharConta();
        System.out.println(c1.getStatus());


    }
}
