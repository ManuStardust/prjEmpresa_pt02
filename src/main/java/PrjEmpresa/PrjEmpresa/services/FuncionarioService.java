package PrjEmpresa.PrjEmpresa.services;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import PrjEmpresa.PrjEmpresa.entities.Departamento;
import PrjEmpresa.PrjEmpresa.entities.Funcionario;
import PrjEmpresa.PrjEmpresa.repositories.FuncionarioRepository;

public class FuncionarioService {
	@Autowired
	private final FuncionarioRepository funcionarioRepository;

	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}

	public Funcionario getFuncionarioById(long funcodigo) {
		return funcionarioRepository.findById(funcodigo).orElse(null);
	}
	
	public Funcionario saveFuncionario(Funcionario Funcionario) {
		return funcionarioRepository.saveAll(Funcionario);
	}
	

		public List<Departamento> getAllFuncionario() {
			return funcionarioRepository.findAll();
		}
		
		
		public Departamento getFuncionarioById(Long id) {
			return funcionarioRepository.findById(id).orElse(null);
		}
		
	
		public boolean deleteFuncionario(Long id) {
			Optional<Funcionario> funcionarioExistente = funcionarioRepository.findById(id);
			if (funcionarioExistente.isPresent()) {
				funcionarioRepository.deleteById(id);
				return true;
			} else {
				return false;
			}
		}
		
		public Funcionario updateFuncionario(Long funcodigo, Funcionario novoFuncionario) {
			Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(funcodigo);
			if (funcionarioOptional.isPresent()) {
				Funcionario funcionarioExistente = funcionarioOptional.get();
				funcionarioExistente.setFunnome(novoFuncionario.getname());
				funcionarioExistente.setFunnascimento(novoFuncionario.getFunnascimento());
				funcionarioExistente.setSalario(novoFuncionario.getSalario());

		
		public Funcionario updatefuncionario(Long id, Funcionario novoFuncionario) {
			java.util.Optional<Departamento> funcionarioOptional = funcionarioRepository.findById(id);
			if (funcionarioOptional.isPresent()) {
				Departamento funcionarioExistente = funcionarioOptional.get();
				funcionarioExistente.setDepartamento(novoFuncionario.getFuncionario());
				funcionarioExistente.setDepartamento(novoFuncionario.getFuncionario());
				return Funcionario.save(funcionarioExistente);
			} else {
				return null;
			}
		}

}
