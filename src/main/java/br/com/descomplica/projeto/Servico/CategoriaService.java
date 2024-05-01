package br.com.descomplica.projeto.Servico;

import java.util.List;
import org.springframework.stereotype.Service;

import br.com.descomplica.projeto.Entidade.Categoria;
import br.com.descomplica.projeto.Repositorio.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;
    
    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

    public Categoria getById(Integer id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria saveCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria updateCategoria(Integer id, Categoria categoria){
        Categoria categoriaAtualizada = categoriaRepository.findById(id).orElse(null);
        if(categoriaAtualizada != null){
            categoriaAtualizada.setCategoriaNome(categoria.getCategoriaNome());
            return categoriaRepository.save(categoriaAtualizada);            
        }
        else{
            return null;
        }
    }

    public Boolean deleteCategoria(Integer id){
        Categoria categoria = categoriaRepository.findById(id).orElse(null);
        if(categoria != null){
            categoriaRepository.delete(categoria);
            return true;
        }
        else{
            return false;
        }
    }
}
