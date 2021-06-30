package romanos;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEscribaRomano {

	private EscribaRomano escriba = new EscribaRomano();

	@Test
	public void creaElEscribaRomanoSinParametros() {
		
		new EscribaRomano();
	}

	@Test
	public void copia1ComoI() {
		
		Assert.assertEquals("I", escriba.copiar(1));
	}
	
	@Test
	public void copia2ComoII() {
		
		Assert.assertEquals("II", escriba.copiar(2));
	}

	@Test
	public void copia3ComoIII() {
		
		Assert.assertEquals("III", escriba.copiar(3));
	}

	@Test
	public void copia4ComoIV() {
		
		Assert.assertEquals("IV", escriba.copiar(4));
	}
	
	@Test
	public void copia5ComoV() {
		
		Assert.assertEquals("V", escriba.copiar(5));
	}
	
	@Test
	public void copia6ComoVI() {
		
		Assert.assertEquals("VI", escriba.copiar(6));
	}
	
	@Test
	public void copia8ComoVIII() {
		
		Assert.assertEquals("VIII", escriba.copiar(8));
	}
	
	@Test
	public void copia13ComoXIII() {
		
		Assert.assertEquals("XIII", escriba.copiar(13));
	}
	
	@Test
	public void copia14ComoXIV() {
		
		Assert.assertEquals("XIV", escriba.copiar(14));
	}

	@Test
	public void copia19ComoXIX() {
		
		Assert.assertEquals("XIX", escriba.copiar(19));
	}
	
	@Test
	public void copia25ComoXXV() {
		
		Assert.assertEquals("XXV", escriba.copiar(25));
	}

	@Test
	public void copia30ComoXXX() {
		
		Assert.assertEquals("XXX", escriba.copiar(30));
	}
	
	@Test
	public void copia53ComoLIII() {
		
		Assert.assertEquals("LIII", escriba.copiar(53));
	}
	
	@Test
	public void copia249ComoCCXLIX() {
		
		Assert.assertEquals("CCXLIX", escriba.copiar(249));
	}

	@Test
	public void copia402ComoCDII() {
		
		Assert.assertEquals("CDII", escriba.copiar(402));
	}

	@Test
	public void copia2537ComoMMDXXXVII() {
		
		Assert.assertEquals("MMDXXXVII", escriba.copiar(2537));
	}
	
	@Test
	public void copia3999ComoMMMCMXCIX() {
		
		Assert.assertEquals("MMMCMXCIX", escriba.copiar(3999));
	}
	
	@Test(expected = Error.class)
	public void noPuedeCopiar0() {
	
		escriba.copiar(0);
	}
}


