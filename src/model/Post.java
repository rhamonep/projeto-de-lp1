/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

public class Post extends DataModel implements Serializable {
    private List<ImageIcon> pictures;
    private List<Comment> comments;
    private boolean visibility;

    public Post(String userName, String text, Date datePosted, List<ImageIcon> pictures) {
        this.userName = userName;
        this.text = text;
        this.datePosted = datePosted;
        this.pictures = pictures;
        comments = new ArrayList();
        visibility = true;
    }
    
    public Post(String userName, String text, Date datePosted) {
        this.userName = userName;
        this.text = text;
        this.datePosted = datePosted;
        this.pictures = null;
        comments = new ArrayList();
        visibility = true;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public List<ImageIcon> getPictures() {
        return pictures;
    }

    public void addPicture(ImageIcon newPicture) {
        this.pictures.add(newPicture);
    }

    public boolean isPublic() {
        return visibility;
    }
    
    public void setVisibility(boolean visibility){
        this.visibility = visibility;
    }
}
