package PrjEmpresa.PrjEmpresa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import PrjEmpresa.PrjEmpresa.entities.Departamento;
import PrjEmpresa.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Departamento, Long> {

	Funcionario saveAll(Funcionario prjEmpresa);
	
	@Query("SELECT f FROM Funcionario f WHERE LOWER(f.funnome) LIKE LOWER(CONCAT('%', :funnome, '%'))")
	List<Funcionario> findByNomeContaining(@Param("funnome") String funnome);

}
