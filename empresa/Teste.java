class Teste
{
  public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario();
    funcionario1.nome = "Paulo";
    funcionario1.RG = "11.111.111-11";
    funcionario1.funcao = "Programador";
    funcionario1.setor = "Fabrica";
    funcionario1.admissao = "01/12/2012"; // Fim do mundo
    funcionario1.salario = 2000.0;

    funcionario1.bonifica(1000);
    funcionario1.demitir();

    if (funcionario1.demitido) {
      System.out.println("O funcionario "+funcionario1.nome+" não trabalha mas aqui. Ele ganhava: R$"+funcionario1.salario);
    }
    else {
      System.out.println("O salario do "+funcionario1.nome+" é: "+funcionario1.salario);
    }
  }
}
