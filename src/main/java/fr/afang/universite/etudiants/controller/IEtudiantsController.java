package fr.afang.universite.etudiants.controller;

import java.util.List;

import fr.afang.universite.etudiants.domain.Etudiants;

public interface IEtudiantsController {

	public List<Etudiants> getEtudiant();

	public Etudiants getEtudiantById(Integer id);

	public Etudiants saveEtudiant(Etudiants etudiant);

	public Etudiants updateEtudiant(Etudiants etudiant, Integer id);

	public void deleteEtudiant(Integer id);

}