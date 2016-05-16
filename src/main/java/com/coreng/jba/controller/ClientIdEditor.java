package com.coreng.jba.controller;

import java.beans.PropertyEditorSupport;

import com.coreng.jba.entities.Client;
import com.coreng.jba.service.ClientService;

public class ClientIdEditor extends PropertyEditorSupport {
	ClientService clientMgr;

	public ClientIdEditor(ClientService cs) {
		this.clientMgr = cs;
	}

	@Override
	public void setAsText(String text) {
		Client client = clientMgr.findById(Long.parseLong(text));
		setValue(client);
	}

}
