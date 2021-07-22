package com.xworkz.service.tranformers.dto;

import java.io.Serializable;

public class TransformerDTO implements Serializable {

	private String name;// char, >3 , <=10,!null
	private String place; // !null, >1, <50
	private String characterType;// min 3 , max 15
	private String angry; // min 1 , max 8
	private String happy; // min 500, max 500000
	private String sad;
	private String likeToDo;

	public TransformerDTO() {
		System.out.println("default");
	}

	
	public TransformerDTO(String name, String place, String characterType, String angry, String happy, String sad,
			String likeToDo) {
		super();
		this.name = name;
		this.place = place;
		this.characterType = characterType;
		this.angry = angry;
		this.happy = happy;
		this.sad = sad;
		this.likeToDo = likeToDo;
	}


	@Override
	public String toString() {
		return "TransformerDTO [name=" + name + ", place=" + place + ", characterType=" + characterType + ", angry="
				+ angry + ", happy=" + happy + ", sad=" + sad + ", likeToDo=" + likeToDo + "]";
	}

	@Override
	public boolean equals(Object arg) {
		if (arg == null)
			return false;
		if (arg instanceof TransformerDTO) {
			TransformerDTO casted = (TransformerDTO) arg;
			if (this.name.equals(casted.name) && this.place.equals(casted.place) && this.happy.equals(casted.happy)
					&& this.sad.equals(casted.sad) && this.likeToDo.equals(casted.likeToDo)) {

			}
		}

		return true;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode : " + this);
		return 12;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getCharacterType() {
		return characterType;
	}


	public void setCharacterType(String characterType) {
		this.characterType = characterType;
	}


	public String getAngry() {
		return angry;
	}


	public void setAngry(String angry) {
		this.angry = angry;
	}


	public String getHappy() {
		return happy;
	}


	public void setHappy(String happy) {
		this.happy = happy;
	}


	public String getSad() {
		return sad;
	}


	public void setSad(String sad) {
		this.sad = sad;
	}


	public String getLikeToDo() {
		return likeToDo;
	}


	public void setLikeToDo(String likeToDo) {
		this.likeToDo = likeToDo;
	}

}