package com.ChintaTravels.demo.servicei;

import java.util.List;

import com.ChintaTravels.demo.model.Bus;
import com.ChintaTravels.demo.model.Passanger;

public interface BusServiceI {

	public void saveData(Bus b);

	public List<Bus> getAllData();

	public void bookbus(Passanger p);

}
