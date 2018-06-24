package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

public class User implements Serializable {
	private String name;
	private String email;
        private String password;
        private ImageIcon profilePicture;
        private List<ImageIcon> pictures;
	private Date dob;  
        private List<Post> feed;
	private List<User> friends;
	private List<User> friendRequests;	
	
	public User(String name, String password, String email, Date dob) {
		this.name = name;
		this.email = email;
                this.password = password;
		this.dob = dob;
		
		this.feed = new ArrayList();
		this.friends = new ArrayList();
		this.friendRequests = new ArrayList();
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
        
            public String getPassword() {
        return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public ImageIcon getProfilePicture() {
            return profilePicture;
        }

        public void setProfilePicture(ImageIcon profilePicture) {
            this.profilePicture = profilePicture;
        }

        public List<ImageIcon> getPictures() {
            return pictures;
        }

        public void addPicture(ImageIcon picture) {
            this.pictures.add(picture);
        }

        public List getFeed() {
            return feed;
        }

        public void addPost(Post post) {
            this.feed.add(post);
        }

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User newFriend) {
		this.friends.add(newFriend);
		this.friendRequests.remove(newFriend);
	}
	
	public List<User> getFriendRequests(){
		return friendRequests;
	}
	
	public void addFriendRequest(User friendRequest) {
		this.friendRequests.add(friendRequest);
	}
}
