package fr.afang.universite.note.controller;

import java.util.List;

import fr.afang.universite.note.domain.Note;

public interface INoteController {

	public List<Note> getNotes();

	public void deleteNote(Integer idEtudiant, Integer idMatiere);

	public Note updateNote(Note note, Integer idEtudiant, Integer idMatiere);

	public Note saveNote(Note note);

	public Note getNoteById(Integer idEtudiant, Integer idMatiere);

}
