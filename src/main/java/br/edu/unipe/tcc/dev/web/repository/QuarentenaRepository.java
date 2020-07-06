package br.edu.unipe.tcc.dev.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unipe.tcc.dev.web.domain.Quarentena;

@Repository
public interface QuarentenaRepository 
                  extends JpaRepository<Quarentena, Long>{
	
	//select * from quarentena where uf=
	public List<Quarentena> findQuarentenaByUf(String uf);
	
	public List<Quarentena> findQuarentenaByUfAndCidade(String uf, String cidade);
	
	public List<Quarentena> findQuarentenaByNomePessoaAndUf(String nomePessoa, String uf);

}
