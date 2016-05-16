package com.coreng.jba.controller;

import java.beans.PropertyEditorSupport;

import com.coreng.jba.entities.Consommation;
import com.coreng.jba.service.ConsommationService;

public class ConsommationIdEditor extends PropertyEditorSupport {

	private ConsommationService consommationMgr;

	public ConsommationIdEditor(ConsommationService cs) {
		this.consommationMgr = cs;
	}

	@Override
	public void setAsText(String text) {
		Consommation conso = consommationMgr.findOne(Long.parseLong(text));
		setValue(conso);
	}
}
