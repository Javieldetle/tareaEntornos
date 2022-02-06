import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(10.0, 12.0);

		System.out.println("The tank with posin level " + tank.getDepositoNivel()) ;
		}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(10.0, 12.0);
		System.out.print("The tank with capacity " + tank.getDepositoMax()) ;
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(10.0, 12.0);
		boolean lleno = false;
		if( tank.fill(0.0) == tank.getDepositoMax()){
		System.out.println(lleno);
		}else System.out.println(lleno = true);
		
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(10.0, 12.0);
		boolean lleno = false;
		if( tank.fill(10.0) == tank.getDepositoMax()){
		System.out.println(lleno);
		}else lleno = true;
		System.out.println("es correcto");
	}

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(30.0, 04.0);
		boolean lleno = false;
		if( tank.fill(6.0) == tank.getDepositoNivel()){
		System.out.println(lleno+ "el deposito esta parcial");
		}else lleno = true;
		System.out.println("el deposito esta lleno");
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}
