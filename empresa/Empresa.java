class Funcionario
{
  String nome;
  String RG;
  String funcao;
  String setor;
  String admissao;
  double salario;
  boolean demitido = false;

  void bonifica(double valor)
  {
    this.salario = this.salario + valor;
  }

  void demitir()
  {
    this.demitido = true;
  }
}
