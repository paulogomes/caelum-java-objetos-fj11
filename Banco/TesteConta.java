import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
 
public class TesteConta {

  private Conta minhaConta;
  private Conta outraConta;

  @Before
  public void inicia()
  {
    minhaConta = new Conta();
    outraConta = new Conta();
  }

 @Test
 public void SacarComSaldo()
 {
    minhaConta.saldo = 2;
    Assert.assertTrue(" Sacar valor menor do que o saldo ", minhaConta.saca(1));
 }

 @Test
 public void SacarMenosLimite()
 {
    minhaConta.saldo = 1;
    minhaConta.limite = 1;
    Assert.assertTrue(" Sacar valor menor que o limite ", minhaConta.saca(2));
 }

 @Test
 public void SacarMaisLimite()
 {
    minhaConta.saldo = 1;
    minhaConta.limite = 1;
    Assert.assertFalse(" Sacar valor maior que o limite ", minhaConta.saca(3));
 }

 @Test
 public void SacarValorNegativo()
 {
    Assert.assertFalse(" Sacar valor negativo ", minhaConta.saca(-1));
 }

 @Test
 public void DepositaContaZerada()
 {
    minhaConta.saldo = 0;
    minhaConta.deposita(1);
    Assert.assertTrue(" Deposita em uma conta sem saldo ", 1 == minhaConta.saldo);
 }

 @Test
 public void DepositaContaNegativa()
 {
    minhaConta.saldo = -1;
    minhaConta.deposita(2);
    Assert.assertTrue(" Deposita em uma conta com saldo negativo ", 1 == minhaConta.saldo);
 }

 @Test
 public void DepositaValorNegativo()
 {
    Assert.assertFalse(" Deposita valor negativo ", minhaConta.deposita(-1));
 }

 @Test
 public void TrasferirSemSaldo()
 {
    minhaConta.saldo = 20;
    Assert.assertFalse(" Trasfere sem saldo ", minhaConta.trasferePara(outraConta, 50));
 }

 @Test
 public void TrasferirComSaldo()
 {
    minhaConta.saldo = 50;
    Assert.assertTrue(" Trasfere Com saldo ", minhaConta.trasferePara(outraConta, 20));
 }

}