/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Group implements Serializable{
	private String name;
	private List<User> members;
	private List<User> memberRequests;
        private List<User> admins;
	private List<ImageIcon> pictures;
	private List<Post> posts;
        
        public Group(String name, User adm){
            this.members = new ArrayList();
            this.memberRequests = new ArrayList();
            this.admins = new ArrayList();
            this.pictures = new ArrayList();
            this.posts = new ArrayList();
            
            this.name = name;
            this.admins.add(adm);
        }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List getMembers() {
		return members;
	}
	
	public void addMember(User newMember) {
		this.members.add(newMember);
	}
	
	public List getMemberRequests() {
		return memberRequests;
	}

	public void addMemberRequest(User memberRequest) {
		this.memberRequests.add(memberRequest);
	}
	
	public List getPictures() {
		return pictures;
	}
	
	public void addPicture(ImageIcon picture) {
		this.pictures.add(picture);
	}
	
	public List getPosts() {
		return posts;
	}
	
	public void addPost(Post newPost) {
		this.posts.add(newPost);
	}
}
