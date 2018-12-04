package fr.afang.universite.note.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afang.universite.enseignant.business.IEnseignantBusiness;
import fr.afang.universite.note.business.INoteBusiness;
import fr.afang.universite.note.domain.Note;
import fr.afang.universite.note.domain.NotePk;
import fr.afang.universite.note.repository.INoteRepository;

@Service
public class NoteBusinessImpl implements INoteBusiness {

	@Autowired
	private INoteRepository noteRepository;

	@Autowired
	private IEnseignantBusiness noteBusiness;

	@Override
	public List<Note> getNotes() {
		List<Note> liste = noteRepository.findAll();
		return liste;
	}

	@Override
	public Note getNoteById(Integer idEtudiant, Integer idMatiere) {
		NotePk pk = new NotePk();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdmatiere(idMatiere);
		Note not = noteRepository.getOne(pk);
		return not;
	}

	@Override
	public void deleteNote(Integer idEtudiant, Integer idMatiere) {
		NotePk pk = new NotePk();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdmatiere(idMatiere);
		noteRepository.deleteById(pk);

	}

	@Override
	public Note updateNote(Note note, Integer idEtudiant, Integer idMatiere) {
		NotePk pk = new NotePk();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdmatiere(idMatiere);
		note.setNotePk(pk);
		return noteRepository.save(note);

	}

	@Override
	public Note saveNote(Note note) {

		return noteRepository.save(note);
	}

}
