public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", "12345-678", "Centro", 100, "São Paulo");
        Endereco endereco2 = new Endereco("Rua B", "98765-432", "Jardins", 200, "Rio de Janeiro");
        PessoaFisica pessoaFisica1 = new PessoaFisica("João Silva", 3000.00, 1, "123.456.789-00", "10.785.781-9");
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa X", 50000.00, 1, "12.345.678/0001-99");
        Conta conta1 = new Conta(100,"19/09/2020", "20/10/2025", "123456", 1, 20000);
        Conta conta2 = new Conta(101,"24/04/2020", "30/11/2026", "504687", 1, 24321);
    }
}