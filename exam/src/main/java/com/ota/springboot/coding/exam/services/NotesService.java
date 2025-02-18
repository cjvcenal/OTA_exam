package com.ota.springboot.coding.exam.services;

import java.util.ArrayList;

import com.ota.springboot.coding.exam.entity.NotesEntity;

public interface NotesService {
	
	public abstract ArrayList<NotesEntity> findAllNotes(); 
	public abstract NotesEntity findbyId(int id);
	public void saveNotes(NotesEntity notesEntity) throws Exception;
	public void deleteNotesbyId(int id);

}
