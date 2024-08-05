package ar.edu.unlp.info.oo1.caso04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//El programa recibe dos colecciones, si ambas colecciones tienen el mismo tamano y es mayor a 5 entonces se realiza el merge.
//caso contrario se retorna una colección ún único valor -1


class caso04test {
  
  private EstrategiaDeMezcla estrategiaIntercalar;
  private ArrayList<String> lista1;
  private ArrayList<String> lista2;
  private ArrayList<String> lista3;
  private ArrayList<String> lista4;

  @BeforeEach
  public void setUp() {
  	estrategiaIntercalar = new EstrategiaDeMezclaIntercalar();
      lista1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
      lista2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));
      lista3 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
      lista4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
      

  }

  @Test
  public void testMezclarColeccionesMismoTamanoMayorA5() {
      ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("A", "1", "B", "2", "C", "3", "D", "4", "E", "5", "F", "6"));
      assertEquals(resultadoEsperado, estrategiaIntercalar.mezclar(lista1, lista2));
  }
  
	@Test
	public void testMezclarColeccionesMismoTamano5(){
      ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("-1"));
      assertEquals(resultadoEsperado, estrategiaIntercalar.mezclar(lista3, lista4));

	}

	@Test
	public void testMezclarColeccionesConTamanoDiferente() {
      ArrayList<String> resultadoEsperado = new ArrayList<>(Arrays.asList("-1"));
      assertEquals(resultadoEsperado, estrategiaIntercalar.mezclar(lista1, lista3));
	}


}
