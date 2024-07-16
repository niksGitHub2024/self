package com.ChintaTravels.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ChintaTravels.demo.model.Bus;
import com.ChintaTravels.demo.model.Passanger;
import com.ChintaTravels.demo.repositary.BusRepositary;
import com.ChintaTravels.demo.repositary.PassangerRepositary;
import com.ChintaTravels.demo.servicei.BusServiceI;

@Service
public class BusServiceImpl implements BusServiceI{

	@Autowired
	BusRepositary br;
	
	@Autowired
	PassangerRepositary pr;
	
	@Override
	public void saveData(Bus b) {
       
		br.save(b);
		
	}

	@Override
	public List<Bus> getAllData() {
       List<Bus> list=(List<Bus>) br.findAll();
		return list;
	}
	

	@Override
	public void bookbus(Passanger p) {
      int id=p.getB().getBid();
      Bus b=br.findById(id).get();
      b.setAvlseat(b.getAvlseat()-1);
      br.save(b);
      pr.save(p);
	}

}
