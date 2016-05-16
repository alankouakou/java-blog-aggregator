package com.coreng.jba.controller;

import java.beans.PropertyEditorSupport;

import com.coreng.jba.entities.TypeConso;
import com.coreng.jba.service.TypeConsoService;

public class TypeConsoIdEditor extends PropertyEditorSupport {
	TypeConsoService typeConsoMgr;

	public TypeConsoIdEditor(TypeConsoService tc) {
		this.typeConsoMgr = tc;
	}

	@Override
	public void setAsText(String text) {
		TypeConso typeConso = typeConsoMgr.findOne(Long.parseLong(text));
		setValue(typeConso);
	}

}
