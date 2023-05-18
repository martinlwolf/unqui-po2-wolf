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
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public abstract class FiltroWikiPage {
	
	public final List<WikiPage> getSimilarPages(WikiPage page, List<WikiPage> wikipedia){
		return wikipedia.stream().filter(pagina -> this.sonSimilares(page, pagina)).collect(Collectors.toList());
		
	}

	protected abstract boolean sonSimilares(WikiPage page, WikiPage pagina);
}
