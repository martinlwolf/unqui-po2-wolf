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
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class WikiPage {
	private String titulo;
	private List<WikiPage> links;
	private Map<String, WikiPage> infobox;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<WikiPage> getLinks() {
		return links;
	}
	public void setLinks(List<WikiPage> links) {
		this.links = links;
	}
	public Map<String, WikiPage> getInfobox() {
		return infobox;
	}
	public void setInfobox(Map<String, WikiPage> infobox) {
		this.infobox = infobox;
	}
	
	
	
	
}
