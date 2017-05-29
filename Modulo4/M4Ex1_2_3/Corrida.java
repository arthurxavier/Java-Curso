class Corrida {
	public static void main(String[] args) {
		
		//Criação dos carros
		CarroCorrida carroEquipe1 =  new CarroCorrida(1,100.0);
		CarroCorrida carroEquipe2 =  new CarroCorrida(200.0);

		Motor motorEquipe1 = new Motor(50);
		carroEquipe1.setMotor(motorEquipe1);

	}


}