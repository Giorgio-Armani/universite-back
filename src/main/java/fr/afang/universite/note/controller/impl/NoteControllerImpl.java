package fr.afang.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.afang.universite.note.business.INoteBusiness;
import fr.afang.universite.note.controller.INoteController;
import fr.afang.universite.note.domain.Note;

@RestController
public class NoteControllerImpl implements INoteController {

	@Autowired
	private INoteBusiness noteBusiness;

	@Override
	@GetMapping("/notes")
	public List<Note> getNotes() {
		List<Note> liste = noteBusiness.getNotes();
		return liste;

	}

	@Override
	@GetMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note getNoteById(@PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {

		Note no = noteBusiness.getNoteById(idEtudiant, idMatiere);
		return no;

	}

	@Override
	@PostMapping("/notes")
	public Note saveNote(@RequestBody Note note) {
		return noteBusiness.saveNote(note);
	}

	@Override
	@PutMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note updateNote(@RequestBody Note note, @PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		return noteBusiness.updateNote(note, idEtudiant, idMatiere);
	}

	@Override
	@DeleteMapping("/notes/{idEtudiant}/{idMatiere}")
	public void deleteNote(@PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		noteBusiness.deleteNote(idEtudiant, idMatiere);

	}

}