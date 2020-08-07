package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MyCalculo implements Calculo{

	@Override
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {
		LinkedHashMap<String, BigDecimal> map = new LinkedHashMap<String, BigDecimal>();
		List<CustoCargo> listToReturn = new ArrayList<CustoCargo>();
		
		for(Funcionario funcionario : funcionarios) {
			if (map.containsKey(funcionario.getCargo())) {
				map.put(funcionario.getCargo(), map.get(funcionario.getCargo()).add(funcionario.getSalario()));
			} else {
				map.put(funcionario.getCargo(), funcionario.getSalario());
			}
		}
		
		for (Map.Entry<String, BigDecimal> entry : map.entrySet()) {
		    CustoCargo custoCargo = new CustoCargo();
		    custoCargo.setCargo(entry.getKey());
		    custoCargo.setCusto(entry.getValue());
		    
		    listToReturn.add(custoCargo);
		}
		
		return listToReturn;
	}

	@Override
	public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {
		LinkedHashMap<String, BigDecimal> map = new LinkedHashMap<String, BigDecimal>();
		List<CustoDepartamento> listToReturn = new ArrayList<CustoDepartamento>();
		
		for(Funcionario funcionario : funcionarios) {
			if (map.containsKey(funcionario.getDepartamento())) {
				map.put(funcionario.getDepartamento(), map.get(funcionario.getDepartamento()).add(funcionario.getSalario()));
			} else {
				map.put(funcionario.getDepartamento(), funcionario.getSalario());
			}
		}
		
		for (Map.Entry<String, BigDecimal> entry : map.entrySet()) {
		    CustoDepartamento custoDepartamento = new CustoDepartamento();
		    custoDepartamento.setDepartamento(entry.getKey());
		    custoDepartamento.setCusto(entry.getValue());
		    
		    listToReturn.add(custoDepartamento);
		}
		
		return listToReturn;
	}

}
