class Motor
{
	String tipo;
	int potencia;
	double velocidadeMaxima;
}

class Carro
{
	String modelo;
	String cor;
	String placa;
	double velocidadeAtual;
	Motor motor = new Motor();

	void liga() {
		System.out.println("O Carro está ligado");
	}

	void acelera(double velocidade) {
		if ((this.velocidadeAtual + velocidade) > this.motor.velocidadeMaxima) {
			this.velocidadeAtual = this.motor.velocidadeMaxima;
		}
		else {
			this.velocidadeAtual = this.velocidadeAtual + velocidade;
		}
	}

	int machaAtual() {
		if (this.velocidadeAtual == 0) {
			return 0;
		}
		if (this.velocidadeAtual > 0 && this.velocidadeAtual < 40) {
		       return 1;
		}
 		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		else {
			return 3;
		}		
	}
}
