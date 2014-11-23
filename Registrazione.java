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

public class Registrazione extends Composite
{
	RootPanel rootPanel;
	private static RegistrazioneUiBinder uiBinder = GWT.create(RegistrazioneUiBinder.class);
	@UiField TextBox textbox_nome;
	@UiField TextBox textbox_username;
	@UiField TextBox textbox_email;
	@UiField TextBox textbox_password;
	@UiField Button registrazione;
	@UiField Button annulla;

	interface RegistrazioneUiBinder extends UiBinder<Widget, Registrazione>
	{
	}

	public Registrazione()
	{
		initWidget(uiBinder.createAndBindUi(this));
		rootPanel = RootPanel.get();
	}
	@UiHandler("registrazione")
	void onButtonClick(ClickEvent event)
	{
		System.out.println(textbox_nome.getText());
		System.out.println(textbox_username.getText());
		System.out.println(textbox_email.getText());
		System.out.println(textbox_password.getText());

		RootPanel rootPanel = RootPanel.get();
		Login obj = new Login();
		rootPanel.clear();
		rootPanel.add(obj);
	}
	
	@UiHandler("annulla")
	void onButton_1Click(ClickEvent event)
	{
		RootPanel rootPanel = RootPanel.get();
		Login obj = new Login();
		rootPanel.clear();
		rootPanel.add(obj);
	}
}