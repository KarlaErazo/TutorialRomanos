package romanos;

public class EscribaRomano {

	private String[] simbolos = {  "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private int[]     valores = { 1000,  900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,   1 };
	
	/**
	 * @pre 'numero' es un valor mayor a 0.
	 * @post traduce el 'numero' a notación romana y la devuelve.
	 */
	public String copiar(int numero) {

		validarQueSeaCopiable(numero);
		
		String romano = "";
		
		for (int i = 0; i < simbolos.length; i++) {
			
			romano += concatenar(simbolos[i], numero / valores[i]);
			numero %= valores[i];
		}
		
		return romano;
	}

	private String concatenar(String simbolo, int cantidad) {
		
		String cadena = "";
		
		for (int i = 0; i < cantidad; i++) {
			
			cadena += simbolo;
		}
		
		return cadena;
	}

	private void validarQueSeaCopiable(int numero) throws Error {
		
		if (numero < 1) {
		
			throw new Error("No se puede copiar un número menor a 1: " + numero);
		}
	}
}
