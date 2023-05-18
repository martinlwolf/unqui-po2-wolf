package ar.edu.unq.po2.tpMethod;

public class FiltroLetraInicial extends FiltroWikiPage {

	@Override
	protected boolean sonSimilares(WikiPage pagina1, WikiPage pagina2) {
		return pagina1.getTitulo().substring(0,1).equals(pagina2.getTitulo().substring(0,1));
	}

}
