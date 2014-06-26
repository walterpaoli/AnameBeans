package com.mvatari.aname.beans.results;

import java.util.List;

import com.mvatari.aname.beans.Bus;

public class BusResult {
	private List<Bus> listaBuses;

	public BusResult(List<Bus> listaBuses) {
		this.listaBuses = listaBuses;
	}

	public List<Bus> getListaBuses() {
		return listaBuses;
	}

	public void setListaBuses(List<Bus> listaBuses) {
		this.listaBuses = listaBuses;
	}
	
	
}
