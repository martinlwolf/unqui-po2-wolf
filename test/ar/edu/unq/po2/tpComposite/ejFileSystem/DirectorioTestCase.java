package ar.edu.unq.po2.tpComposite.ejFileSystem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class DirectorioTestCase {
	private Directorio directorio;
	@Mock private Archivo archivo;
	private Directorio directorio2;
	@Mock private Archivo archivo2;
	@Mock private Archivo archivo3;
	
	@BeforeEach
	public void setUp() {
		this.directorio = new Directorio(LocalDate.now());
		this.archivo = mock(Archivo.class);
		this.archivo2 = mock(Archivo.class);
		this.archivo3 = mock(Archivo.class);
		this.directorio2 = mock(Directorio.class);
		this.directorio.agregarElemento(this.archivo);
		this.directorio.agregarElemento(this.archivo2);
		this.directorio.agregarElemento(this.directorio2);
		this.directorio2.agregarElemento(this.archivo3);
	}
	
	@Test
	public void testCuandoAgregoArchivosAlDirectorioElTamañoAumenta() {
		assertEquals(3, this.directorio.cantidadDeElementos());
	}
	
	@Test
	public void testAlPedirElTamañoDevuelveElCorrecto() {
		when(archivo.totalSize()).thenReturn(5);
		when(archivo2.totalSize()).thenReturn(5);
		when(directorio2.totalSize()).thenReturn(5);
		assertEquals(15, this.directorio.totalSize());
		verify(archivo, times(1)).totalSize();
		verify(archivo2, times(1)).totalSize();
	}
	
	@Test
	public void testAlPedirElUltimoModificadoSeDevuelveElCorrecto() {
		when(archivo.fecha()).thenReturn(LocalDate.of(2023, 7, 10));
		when(archivo2.fecha()).thenReturn(LocalDate.of(2023, 6, 10));
		when(directorio2.fecha()).thenReturn(LocalDate.of(2023, 8, 10));
		assertEquals(this.directorio2.fecha(), this.directorio.lastModified().fecha());
	}
	
	@Test
	public void testAlPedirElElementoMasAntiguoSeDevuelveElCorrecto() {
		when(archivo.fecha()).thenReturn(LocalDate.of(2023, 7, 10));
		when(archivo2.fecha()).thenReturn(LocalDate.of(2023, 6, 10));
		when(directorio2.fecha()).thenReturn(LocalDate.of(2023, 8, 10));
		assertEquals(this.archivo2.fecha(), this.directorio.oldestElement().fecha());
	}

	
}
