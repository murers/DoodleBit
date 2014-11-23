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

public class Login extends Composite
{
	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);
	@UiField Button button;
	@UiField Button button_1;
	@UiField Button button_2;
	@UiField Button button_3;
	@UiField TextBox textbox_user;
	@UiField TextBox textbox_pass;

	interface LoginUiBinder extends UiBinder<Widget, Login>
	{
	}

	public Login()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiHandler("button")
	void onButtonClick(ClickEvent event)
	{
		System.out.println(textbox_user.getText());
		System.out.println(textbox_pass.getText());
		RootPanel root = RootPanel.get();
		GestisciEvento obj = new GestisciEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("button_1")
	void onButton_1Click(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		PartecipaEvento obj = new PartecipaEvento();
		root.clear();
		root.add(obj);
	}
	@UiHandler("button_2")
	void onButton_2Click(ClickEvent event)
	{
		RootPanel root = RootPanel.get();
		Registrazione obj = new Registrazione();
		root.clear();
		root.add(obj);
	}
	@UiHandler("button_3")
	void onButton_3Click(ClickEvent event)
	{
	}
}