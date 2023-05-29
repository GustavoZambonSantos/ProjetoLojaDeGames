package com.LojadeGames.LojaDeGames.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojadeGames.LojaDeGames.Model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
}
