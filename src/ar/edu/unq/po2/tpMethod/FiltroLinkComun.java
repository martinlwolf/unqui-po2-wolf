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
import java.util.Iterator;

public class FiltroLinkComun extends FiltroWikiPage {

	@Override
	protected boolean sonSimilares(WikiPage pagina1, WikiPage pagina2) {
		return pagina1.getLinks().stream().filter(link -> pagina2.getLinks().contains(link)).findFirst().isPresent();
	}

}
