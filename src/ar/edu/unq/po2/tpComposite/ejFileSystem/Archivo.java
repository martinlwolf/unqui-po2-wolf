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

public class Archivo implements FileSystem {
	
	public Archivo(int tamaño, LocalDate fechaDeModificacion) {
		super();
		this.tamaño = tamaño;
		this.fechaDeModificacion = fechaDeModificacion;
	}

	private int tamaño;
	private LocalDate fechaDeModificacion;
	
	public Archivo(int tamaño) {
		super();
		this.tamaño = tamaño;
	}

	@Override
	public int totalSize() {
		return this.tamaño;
	}
	
	public FileSystem lastModified() {
		return this;
	}
	
	public LocalDate fecha() {
		return this.fechaDeModificacion;
	}
}
