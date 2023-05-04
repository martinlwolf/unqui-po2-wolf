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

public class Directorio implements FileSystem {
	private ArrayList<FileSystem> listaDeElementos;
	private LocalDate fechaDeCreacion;

	public Directorio(LocalDate fechaDeCreacion) {
		super();
		this.fechaDeCreacion = fechaDeCreacion;
		this.listaDeElementos = new ArrayList<FileSystem>();
	}
	
	public void agregarElemento(FileSystem elemento) {
		this.listaDeElementos.add(elemento);
	}
	
	public int cantidadDeElementos() {
		return this.listaDeElementos.size();
	}

	public int totalSize() {
		return this.listaDeElementos.stream().mapToInt(elemento -> elemento.totalSize()).sum();
	}
	
	public LocalDate fecha() {
		return this.fechaDeCreacion;
	}

	public FileSystem lastModified() {
		return this.listaDeElementos.stream()
				.max((FileSystem f1, FileSystem f2) -> f1.fecha()
				.compareTo(f2.fecha()))
				.get();
	}
	
	public FileSystem oldestElement() {
		return this.listaDeElementos.stream()
				.min((FileSystem f1, FileSystem f2) -> f1.fecha()
				.compareTo(f2.fecha()))
				.get();
	}
}
