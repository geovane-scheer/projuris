package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desafio")
public class ProjurisController {
	
	@Autowired private MyFindArray myFindArray;
	@Autowired private MyFindChar myFindChar;
	@Autowired private MyCalculo myCalculo;
	
	@RequestMapping(value = "questao1/{array}/{subArray}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public int questao1(@PathVariable int[] array, @PathVariable int[] subArray)throws Exception {
		return myFindArray.findArray(array, subArray);
	}
	
	@RequestMapping(value = "questao2/{word}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public char questao2(@PathVariable String word)throws Exception {
		return myFindChar.findChar(word);
	}
	
	@RequestMapping(value = "questao3/custoPorCargo", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<CustoCargo> questao3parte1() throws Exception {
		
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1); listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3); listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5); listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7); listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9); listaFuncionario.add(funcionario10);
		
		return myCalculo.custoPorCargo(listaFuncionario);
		
	}
	
	@RequestMapping(value = "questao3/custoPorDepartamento", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<CustoDepartamento> questao3parte2() throws Exception {
		
		Funcionario funcionario1 = new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0));
		Funcionario funcionario2 = new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70));
		Funcionario funcionario3 = new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45));
		Funcionario funcionario4 = new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9));
		Funcionario funcionario5 = new Funcionario("Gerente", "Financeiro", new BigDecimal(7500));
		Funcionario funcionario6 = new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0));
		Funcionario funcionario7 = new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4));
		Funcionario funcionario8 = new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90));
		Funcionario funcionario9 = new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50));
		Funcionario funcionario10 = new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0));
		List<Funcionario> listaFuncionario = new ArrayList<>();
		listaFuncionario.add(funcionario1); listaFuncionario.add(funcionario2);
		listaFuncionario.add(funcionario3); listaFuncionario.add(funcionario4);
		listaFuncionario.add(funcionario5); listaFuncionario.add(funcionario6);
		listaFuncionario.add(funcionario7); listaFuncionario.add(funcionario8);
		listaFuncionario.add(funcionario9); listaFuncionario.add(funcionario10);
		
		return myCalculo.custoPorDepartamento(listaFuncionario);
		
	}
	
	


}
