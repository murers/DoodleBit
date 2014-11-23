package com.sample.Doodle.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.TextBox;

public class CreaEvento extends Composite
{
	private static CreaEventoUiBinder uiBinder = GWT
			.create(CreaEventoUiBinder.class);
	@UiField Button button;
	@UiField TextBox textbox_nome;
	@UiField TextBox textbox_luogo;
	@UiField TextBox textbox_descrizione;
	@UiField Button salva_dati;
	@UiField Button aggiorna;
	@UiField Button modifica_dati;
	@UiField Button sondaggio;
	@UiField Button registra_evento;

	interface CreaEventoUiBinder extends UiBinder<Widget, CreaEvento>
	{
	}

	public CreaEvento()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		GestisciEvento obj = new GestisciEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("salva_dati")
	void onSalva_datiClick(ClickEvent event)
	{
		String totale = (textbox_nome.getText()+textbox_luogo.getText()+textbox_descrizione.getText());
		System.out.println(totale);
	}
}