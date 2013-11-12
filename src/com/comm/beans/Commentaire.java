package com.comm.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Commentaire {
	public Commentaire(){
		
	}
	
	public void setContenu(String contenu){
		this.contenu = contenu;
	}
	
	public String getContenu(){
		return this.contenu;
	}
	
	public void setAuteur(String auteur){
		this.auteur = auteur;
	}
	
	public String getAuteur(){
		return this.auteur;
	}
	
	public void setTimestamp(long currentTimeMillis) {
		this.timestamp = currentTimeMillis; 
	}
	
	public long getTimestamp() {
		return this.timestamp; 
	}
	
	private long timestamp;
	private String contenu;
	private String auteur;
}
