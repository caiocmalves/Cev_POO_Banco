package classes;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public void abrirConta(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = true;
        if (getTipo() == "CC") {
            this.saldo += 50;            
        } else {
            this.saldo += 150;
        }
    }
    
    public void fecharConta(){
        if (getSaldo() == 0 && getStatus() == true) {
            this.status = false;
            System.out.println("Sua conta foi fechada!");
        }else {
            System.out.println("Você não pode fechar sua conta!");
        }
    } 
    
    public void depositar(double valor) {
        if (getStatus() == true) {
            this.saldo += valor;
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("Sua conta está fechada, não foi possível executar o depósito!");
        }
    }
    
    public void sacar(double valor) {
        if (getStatus() != true) {
            System.out.println("Sua conta não está aberta, por isso, não podemos executar o saque.");
        }
        else if (getSaldo() < valor)
            System.out.println("Seu saldo é inferior ao valor que pretende sacar!");
        else {
            this.saldo -= valor;
            System.out.println("Seu saque foi efetuado!");
        }
    }

    public void pagarMensal() {
        if (getTipo() == "CC" && getStatus() == true) {
            this.saldo -= 12;
            System.out.println("A mensalidade foi debitada!");
        }
        else if(getTipo() == "CP" && getStatus() == true) {
            this.saldo -= 20;
            System.out.println("A mensalidade foi debitada!");
        }
    }
    
    public int getNumConta() {
        return numConta;        
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono(){
        return dono;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
}


