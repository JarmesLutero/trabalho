package teste;

import junit.framework.Assert;

public class TesteNumerosRomanos {
	

	
	
	@SuppressWarnings("deprecation")
	public void conversaoEmRomanos() {
	
	ConversorDeNumerosRomanos converter = new ConversorDeNumerosRomanos();
	ConversorDeNumerosRomanos converter1 = new ConversorDeNumerosRomanos();
	ConversorDeNumerosRomanos converter2 = new ConversorDeNumerosRomanos();
int decimal = converter.converte("XXX");
int decimal1 = converter1.converte("XIX");
int decimal2 = converter2.converte("XXXX");


int esperado = 30;	
int esperado1 = 19;
int esperado2 = 0;

	Assert.assertEquals(esperado, decimal);
	Assert.assertEquals(esperado1, decimal1);
	Assert.assertEquals(esperado2, decimal2);
	
	
	}
}
