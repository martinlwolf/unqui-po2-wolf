package ar.edu.unq.po2.tpComposite.ejFileSystem;

import java.time.LocalDate;

public interface FileSystem {
	
	public int totalSize();
	
	public FileSystem lastModified();
	
	public LocalDate fecha();

}
