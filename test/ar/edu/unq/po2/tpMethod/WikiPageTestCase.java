package ar.edu.unq.po2.tpMethod;
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

public class WikiPageTestCase {
	private FiltroLetraInicial finicial;
	private FiltroLinkComun flink;
	private FiltroPropiedadComun fpropiedad;
	private List<WikiPage> listaWiki;
	@Mock private WikiPage wiki1;
	@Mock private WikiPage wiki2;
	@Mock private WikiPage wiki3;
	@Mock private WikiPage wiki4;
	@Mock private WikiPage wiki5;
	
	@BeforeEach
	public void setUp() {
		this.finicial = new FiltroLetraInicial();
		this.flink = new FiltroLinkComun();
		this.fpropiedad = new FiltroPropiedadComun();
		this.wiki1 = mock(WikiPage.class);
		this.wiki2 = mock(WikiPage.class);
		this.wiki3 = mock(WikiPage.class);
		this.wiki4 = mock(WikiPage.class);
		this.wiki5 = mock(WikiPage.class);
	}
	
	@Test
	public void testDeSimilaresPorLetraInicial() {
		when(this.wiki1.getTitulo()).thenReturn("abc");
		when(this.wiki2.getTitulo()).thenReturn("amm");
		assertTrue(this.finicial.sonSimilares(wiki2, wiki1));
	}
	
	@Test
	public void testCuandoFiltroPorLetraInicialDevuelve2() {
		when(this.wiki1.getTitulo()).thenReturn("abc");
		when(this.wiki2.getTitulo()).thenReturn("amm");
		when(this.wiki3.getTitulo()).thenReturn("bdd");
		when(this.wiki4.getTitulo()).thenReturn("atv");
		this.listaWiki = Arrays.asList(this.wiki2, this.wiki3, this.wiki4);
		List<WikiPage> listaFinal = this.finicial.getSimilarPages(wiki1, listaWiki);
		assertEquals(Arrays.asList(this.wiki2, this.wiki4), listaFinal);
	}
	
	@Test
	public void testDeSimilaresPorLinkComun() {
		when(this.wiki1.getLinks()).thenReturn(Arrays.asList(this.wiki3));
		when(this.wiki2.getLinks()).thenReturn(Arrays.asList(this.wiki3));
		assertTrue(this.flink.sonSimilares(wiki2, wiki1));
	}
	
	@Test
	public void testCuandoFiltroPorLinkComunDevuelve2() {
		when(this.wiki1.getLinks()).thenReturn(Arrays.asList(this.wiki3));
		when(this.wiki2.getLinks()).thenReturn(Arrays.asList(this.wiki3));
		when(this.wiki5.getLinks()).thenReturn(Arrays.asList(this.wiki4));
		this.listaWiki = Arrays.asList(this.wiki2, this.wiki5);
		List<WikiPage> listaFinal = this.flink.getSimilarPages(wiki1, listaWiki);
		assertEquals(Arrays.asList(this.wiki2), listaFinal);
	}
	
	/*@Test
	public void testDeSimilaresPorPropiedadComun() {
		when(this.wiki1.getInfobox()).thenReturn();
		when(this.wiki2.getInfobox()).thenReturn(Arrays.asList(this.wiki3));
		assertTrue(this.flink.sonSimilares(wiki2, wiki1));
	}*/
}
