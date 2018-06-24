/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Post extends DataModel {
	private ArrayList<ImageIcon> picture;
	private ArrayList<Comment> comments;
	private String description;
        
        public Post(){
        comments = new ArrayList<>();
        picture = new ArrayList<>();
        }
	
        public ArrayList<Comment> getComments() {
		return comments;
	}
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}

    public ArrayList<ImageIcon> getPicture() {
        return picture;
    }

    public void setPicture(ArrayList<ImageIcon> picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void addPicture(ImageIcon newPicture) {
		this.picture.add(newPicture);	
    }
     
}
