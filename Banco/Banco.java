class Cliente
{
  String nome;
  String sobrenome;
  String CPF;
}

class Conta
{
  int numero;
  Cliente titular = new Cliente();
  double saldo;
  double limite;

  boolean saca(double valor)
  {
    if ((valor <= 0) || (this.saldo + this.limite) < valor) {
      return false;
    }
    else {
      this.saldo -= valor;
      return true;
    }
  }

  boolean deposita(double valor)
  {
    if (valor <=0) {
      return false;
    }
    else {
      this.saldo += valor;
      return true;
    }
  }

  boolean trasferePara(Conta destino, double quantia)
  {
    if (this.saca(quantia)) {
      destino.deposita(quantia);
      return true;
    }
    else {
      return false;
    }
  }

}