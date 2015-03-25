class Teste
{
	public static void main(String[] args)
	{
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Gol";
		meuCarro.cor = "Vermelho";
		meuCarro.velocidadeAtual = 0;
		meuCarro.motor.velocidadeMaxima = 80;

		meuCarro.liga();

		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual+"KM/h na "+meuCarro.machaAtual()+"o Macha");

		meuCarro.acelera(70);
		System.out.println(meuCarro.velocidadeAtual+"KM/h na "+meuCarro.machaAtual()+"o Macha");
	}
}
